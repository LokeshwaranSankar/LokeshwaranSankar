import java.awt.*;
class Simple extends Frame {
	Simple() {
		Button sk = new Button("enter");
		add(sk);
		setVisible(true);
		setSize(200, 200);
	}

	public static void main(String[] args) {
		new  Simple();

	}
}
