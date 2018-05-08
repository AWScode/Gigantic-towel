import java.awt.*;
import java.awt.event.*;

public class MainFrame extends Frame{

  private Button b;
  private TextField tf;
  private Label name;
  private Label wel;
  private Label wel2;
  private TextArea ta;
  private Button b2;
  private Choice c;
  private Frame f2;

  public MainFrame() {
    //to close the system
    addWindowListener(new WindowAdapter() {
      public void windowClosing(WindowEvent windowEvent){
        System.exit(0);
      }
    });

    setSize(600,500);
    setLayout(null);
    setVisible(true);



//for frame 2----------------------------
    f2 = new Frame();
    f2.setSize(200,600);
    f2.setLayout(null);
    f2.setVisible(false);
    f2.addWindowListener(new WindowAdapter() {
      public void windowClosing(WindowEvent windowEvent){
        System.exit(0);
      }
    });

    b = new Button("Click me!");
    b.setBounds(50,100,100,30);
    f2.add(b);

//for frame 1----------------------------
    wel = new Label("Welcome to Kitty's Restaurant :)");
    wel.setBounds(50, 50, 200, 30);
    add(wel);

    wel2 = new Label("Every dish here is $10! Enjoy~~");
    wel2.setBounds(50, 70, 200, 30);
    add(wel2);


    // tf = new TextField("Welcome to the Restaurant!");
    // tf.setBounds(80, 70, 200, 30);
    // add(tf);


    b.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e){
        tf.setText("You clicked the button!");
      }
    });


    name = new Label("Your name:");
    name.setBounds(70, 250, 80, 30);
    add(name);
    ta = new TextArea();
    ta.setBounds(150,250,200,40);
    add(ta);

    c = new Choice();
    c.setBounds(5, 120, 75, 180);
    c.add("10%");
    c.add("12.5%");
    c.add("15%");
    c.add("17.5%");
    c.add("20%");
    add(c);
    //ta.addTextListener(new MyTextListener());
    b2 = new Button("Submit");
    b2.setBounds(150, 200, 100, 30);
    add(b2);
    b2.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e2){
        tf.setText("Your name is: " + ta.getText());
      }
    });


  }

  class MyTextListener implements TextListener {
    public void textValueChanged(TextEvent e) {
      tf.setText("");
    }
  }
  /*public void addCheckbox() {
    Checkbox check1 = new Checkbox("Yes");
    check1.setBounds(220, 50, 80, 30);
    this.add(check1);
    Checkbox check2 = new Checkbox("No");
    check2.setBounds(220, 75, 80, 30);
    this.add(check2);
  }
*/public String calcTip(String perc) {
    return null;
}

/*
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
*/
  public static void main(String[] args) {
    MainFrame m = new MainFrame();





  }
}
