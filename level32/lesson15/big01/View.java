package com.javarush.test.level32.lesson15.big01;

import com.javarush.test.level32.lesson15.big01.listeners.FrameListener;
import com.javarush.test.level32.lesson15.big01.listeners.TabbedPaneChangeListener;
import com.javarush.test.level32.lesson15.big01.listeners.UndoListener;

import javax.swing.*;
import javax.swing.undo.CannotUndoException;
import javax.swing.undo.UndoManager;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by user on 25.07.2016.
 */
public class View extends JFrame implements ActionListener
{
    private Controller controller;

    private UndoManager undoManager = new UndoManager();
    private UndoListener undoListener = new UndoListener(undoManager);

    private JTabbedPane tabbedPane = new JTabbedPane();
    private JTextPane htmlTextPane = new JTextPane();
    private JEditorPane plainTextPane = new JEditorPane();


    public Controller getController()
    {
        return controller;
    }

    public void setController(Controller controller)
    {
        this.controller = controller;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent)
    {
      String command =  actionEvent.getActionCommand();
        switch (command)
        {
            case "Новый":
                controller.createNewDocument();
                break;
            case "Открыть":
                controller.openDocument();
                break;
            case "Сохранить":
                controller.saveDocument();
                break;
            case "Сохранить как...":
                controller.saveDocumentAs();
                break;
            case "Выход":
                controller.exit();
                break;
            case "О программе":
                showAbout();
                break;

        }

    }
    public void init()
    {
        initGui();
        FrameListener frameListener = new FrameListener(this);
        this.addWindowListener(frameListener);
        this.setVisible(true);


    }
    public void exit()
    {
        controller.exit();
    }

    public void initMenuBar()
    {
        JMenuBar jMenuBar = new JMenuBar();
        MenuHelper.initFileMenu(this,jMenuBar);
        MenuHelper.initEditMenu(this,jMenuBar);
        MenuHelper.initStyleMenu(this,jMenuBar);
        MenuHelper.initAlignMenu(this,jMenuBar);
        MenuHelper.initColorMenu(this,jMenuBar);
        MenuHelper.initFontMenu(this,jMenuBar);
        MenuHelper.initHelpMenu(this,jMenuBar);
        getContentPane().add(jMenuBar, BorderLayout.NORTH);

    }
    public void initEditor()
    {
        htmlTextPane.setContentType("text/html");
        JScrollPane pane = new JScrollPane(htmlTextPane);
        tabbedPane.addTab("HTML", pane);
        JScrollPane scrollPane = new JScrollPane(plainTextPane);
        tabbedPane.addTab("Текст", scrollPane);
        tabbedPane.setPreferredSize(new Dimension(800,600));
        TabbedPaneChangeListener listener = new TabbedPaneChangeListener(this);
        tabbedPane.addChangeListener(listener);
        getContentPane().add(tabbedPane, BorderLayout.CENTER);


    }
    public void initGui()
    {
        initMenuBar();
        initEditor();
        pack();
    }
    public void selectedTabChanged()
    {
        if(isHtmlTabSelected())
        {
            controller.setPlainText(plainTextPane.getText());
        }
        else
        {
            plainTextPane.setText(controller.getPlainText());
        }
        resetUndo();

    }
    public View() {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (IllegalAccessException e) {
            ExceptionHandler.log(e);
        } catch (InstantiationException e) {
            ExceptionHandler.log(e);
        } catch (UnsupportedLookAndFeelException e) {
            ExceptionHandler.log(e);
        } catch (ClassNotFoundException e) {
            ExceptionHandler.log(e);
        }
    }
    public boolean canUndo()
    {
        return undoManager.canUndo();
    }
    public boolean canRedo()
    {
        return undoManager.canRedo();
    }
    public void undo()
    {
        try
        {
            undoManager.undo();
        }
        catch (CannotUndoException e)
        {
            ExceptionHandler.log(e);
        }
    }
    public void redo()
    {
        try
        {
            undoManager.redo();
        }
        catch (CannotUndoException e)
        {
            ExceptionHandler.log(e);
        }

    }

    public void resetUndo()
    {
        undoManager.discardAllEdits();
    }

    public UndoListener getUndoListener()
    {
        return undoListener;
    }
    public boolean isHtmlTabSelected()
    {
        return tabbedPane.getSelectedIndex() == 0;
    }
    public void selectHtmlTab()
    {
        tabbedPane.setSelectedIndex(0);
        resetUndo();
    }
    public void update()
    {
        htmlTextPane.setDocument(controller.getDocument());
    }
    public void showAbout()
    {
        JOptionPane.showMessageDialog(this, "HTML Editor is coded by Ivan Veshtard", "About", JOptionPane.INFORMATION_MESSAGE);

    }

}
