package gui.frames;

public class FrameFactory{
	public static MyFrame createFrame(String title){
		MyFrame newFrame = new MyFrame(title);
		newFrame.setVisible(true);
		return newFrame;
	}
}
