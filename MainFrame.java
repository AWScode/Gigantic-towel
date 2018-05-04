import java.awt.*;
import java.awt.event.*;

public class MainFrame extends Frame{

  private Button b;
  private TextField tf;



  public MainFrame() {

    setSize(400,500);
    setLayout(null);
    setVisible(true);
  }

  public void addButton() {
    Button b = new Button("Start to order");
    b.setBounds(90,200,100,30);
    this.add(b);
  }
  public void addButton2() {
    Button b = new Button("Continue");
    b.setBounds(90,100,100,30);
    this.add(b);
  }

  public void addLabel() {
    Label lab = new Label("Welcome to Kitty's Restaurant!");
    lab.setBounds(90, 70, 120, 30);
    this.add(lab);
  }

  public void addCheckbox() {
    Checkbox check1 = new Checkbox("For here");
    check1.setBounds(220, 50, 80, 30);
    this.add(check1);
    Checkbox check2 = new Checkbox("To go");
    check2.setBounds(220, 75, 80, 30);
    this.add(check2);
  }

  public void addChoice() {
    Choice c = new Choice();
    c.setBounds(5, 20, 75, 180);
    c.add("for here");
    c.add("to go");

    this.add(c);
  }
  public void addmenuLabel() {
    Label lab = new Label("menu");
    lab.setBounds(90, 70, 120, 30);
    this.add(lab);
  }
  public void addList() {
    List l = new List(5);
    l.setBounds(320, 60, 45, 180);
    l.add("a");
    l.add("b");
    l.add("c");
    l.add("d");
    l.add("e");
    this.add(l);
  }

  public static void main(String[] args) {
    MainFrame m = new MainFrame();
    m.addButton();
    m.addButton2();
    m.addLabel();
    m.addCheckbox();
    m.addChoice();
    m.addList();
    m.addmenuLabel();

  }

}
