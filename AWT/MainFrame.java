import java.awt.*;
import java.awt.event.*;

public class MainFrame extends Frame{

  private Button b;
  private Button b3;
  private Button b4;
  private TextField tf;
  private TextArea tf2;
  private TextField tf3;
  private Label name;
  private Label wel;
  private Label wel2;
  private Label wel3;
  private Label wel4;
  private Label wel5;
  private Label menu;
  private Label l2;
  private Label l3;
  private TextArea ta;
  private Button b2;
  private Choice c;
  private Choice c2;
  private Frame f2;
  private Checkbox check1;
  private Checkbox check2;
  private Checkbox check3;
  private Checkbox check4;
  private Checkbox check5;
  private Checkbox check6;






  public MainFrame() {
    //to close the system
    addWindowListener(new WindowAdapter() {
      public void windowClosing(WindowEvent windowEvent){
        System.exit(0);
      }
    });

    setSize(600,700);
    setLayout(null);
    setVisible(true);
    setBackground(Color.pink);



//for frame 2----------------------------
    f2 = new Frame();
    f2.setSize(300,600);
    f2.setLayout(null);
    f2.setVisible(false);
    f2.addWindowListener(new WindowAdapter() {
      public void windowClosing(WindowEvent windowEvent){
        System.exit(0);
      }
    });

    b = new Button("Add tips");
    b.setBounds(50,500,100,30);
    f2.add(b);

    b4 = new Button("Confirm");
    b4.setBounds(50,550,100,30);
    f2.add(b4);

    b4.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e){
        System.exit(0);
      }
    });


    b.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e){
        int c2int = Integer.parseInt(c2.getSelectedItem());
        int total = calcTotal() + c2int;
        tf3.setText("Total price: $" + total);
      }
    });

    // cbLabel()
    l2 = new Label("Your receipt:");
    l2.setBounds(50, 50, 100, 30);
    f2.add(l2);

    l3 = new Label("Choose tips ($):");
    l3.setBounds(30, 380, 100, 30);
    f2.add(l3);

    c2 = new Choice();
    c2.setBounds(30, 410, 110, 30);
    c2.add("3");
    c2.add("5");
    c2.add("7");
    c2.add("10");
    c2.add("15");
    f2.add(c2);






//for frame 1----------------------------
    wel = new Label("Welcome to Kitty's Restaurant :)");
    wel.setBounds(50, 50, 200, 30);
    add(wel);

    wel2 = new Label("Enjoy~~");
    wel2.setBounds(50, 70, 250, 30);
    add(wel2);

    menu = new Label("------------------------MENU------------------------");
    menu.setBounds(50, 120, 500, 30);
    add(menu);

    wel3 = new Label("Main Coursess:");
    wel3.setBounds(50, 150, 150, 30);
    add(wel3);

    wel5 = new Label("Drinks:");
    wel5.setBounds(400, 150, 150, 30);
    add(wel5);

    Checkbox checkdrink = new Checkbox("Free Lemon juice");
    checkdrink.setBounds(370, 180, 300, 30);
    this.add(checkdrink);

    wel4 = new Label("Choose where to eat:");
    wel4.setBounds(330, 50, 200, 30);
    add(wel4);

    c = new Choice();
    c.setBounds(330, 80, 110, 30);
    c.add("For here");
    c.add("To go");
    add(c);



    check1 = new Checkbox("$30 Braised Leeks with Mozzarella");
    check1.setBounds(30, 330, 300, 30);
    add(check1);


    check2 = new Checkbox("$20 Lamb Salad with Fregola");
    check2.setBounds(30, 180, 300, 30);
    add(check2);


    check3 = new Checkbox("$25 Smoked Pork Jowl with Pickles");
    check3.setBounds(30, 210, 300, 30);
    add(check3);


    check4 = new Checkbox("$15 Scallop Sashimi with Lemon Confit");
    check4.setBounds(30, 240, 300, 30);
    add(check4);


    check5 = new Checkbox("$12 Vegan Charcuterie");
    check5.setBounds(30, 270, 300, 30);
    add(check5);


    check6 = new Checkbox("$13 Pappardelle with Sea Urchin");
    check6.setBounds(30, 300, 300, 30);
    add(check6);




    b3 = new Button("see total price");
    b3.setBounds(30, 450, 150, 30);
    add(b3);

    b3.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e){
        int total = calcTotal();
        tf.setText("Total price: $" + total);
      }
    });



    tf = new TextField("Total price: $0");
    tf.setBounds(30, 400, 200, 30);
    add(tf);

    tf2 = new TextArea(cbLabel());
    tf2.setBounds(30, 80, 250, 250);
    f2.add(tf2);

    tf3 = new TextField("Total price: ");
    tf3.setBounds(30, 440, 250, 30);
    f2.add(tf3);


    b.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e2){
        int total2 = calcTotal();
        tf.setText("Total price: $" + total2);

      }
    });


    b2 = new Button("Print the receipt");
    b2.setBounds(30, 500, 150, 30);
    add(b2);

    b2.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e2){
        tf2.setText(cbLabel());
        f2.setVisible(true);
      }
    });


  }

  class MyTextListener implements TextListener {
    public void textValueChanged(TextEvent e) {
      tf.setText("");
    }
  }



  public String cbLabel() {
    String cbLabel = " ";

    if (this.check1.getState()){
      cbLabel = this.check1.getLabel();

    }
    if (this.check2.getState()){
      cbLabel = cbLabel + "\n" + this.check2.getLabel();
    }
    if (this.check3.getState()){
      cbLabel = cbLabel + "\n" + this.check3.getLabel();
    }
    if (this.check4.getState()){
      cbLabel = cbLabel + "\n" + this.check4.getLabel();
    }
    if (this.check5.getState()){
      cbLabel = cbLabel + "\n" + this.check5.getLabel();
    }
    if (this.check6.getState()){
      cbLabel = cbLabel + "\n" + this.check6.getLabel();
    }

    return cbLabel;
  }


  public int calcTotal() {
    int total = 0;//default
    if (this.check1.getState()){
      total = total + 30;
    }
    if (this.check2.getState()){
      total = total + 20;
    }
    if (this.check3.getState()){
      total = total + 25;
    }
    if (this.check4.getState()){
      total = total + 15;
    }
    if (this.check5.getState()){
      total = total + 12;
    }
    if (this.check6.getState()){
      total = total + 13;
    }
    return total;
  }


  public static void main(String[] args) {
    MainFrame m = new MainFrame();





  }
}
