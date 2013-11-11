package maria.com;

import android.content.Context;
import android.speech.tts.TextToSpeech;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MyButton extends Button{
	

	public class MyListener implements OnClickListener
	{

		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			boxText = (EditText) findViewById(R.id.input_text);
			boxText.getText().insert(boxText.getSelectionStart(), ((MyButton)v).getText());
		}
	}

	public static MyListener listener = null;

	private static Context con;
	private EditText boxText;

	public MyButton(){this("Blank");}

	public MyButton(String name){
		this(name, android.R.color.black);
	}

	public MyButton(String name, int col) {
		this(name, col, con);
	}

	public MyButton(String name, int col, Context context) {
		super(context);   //necessary context...dont know why :S
		//setBackgroundResource(R.drawable.icon);
		//setTextColor(col);
		//setBackgroundColor(col);
		setBackgroundResource(R.color.green_button);
		setText(name);
		setTextSize(18);
		
	}
	
	

	public MyButton(int category, final String phrase, int rw, final Context context) {
		super(context);
		switch(category) {
		case Categories.VERBOS: 
			setBackgroundResource(R.color.green_button);
			break;
		case Categories.NOMBRES:
			setBackgroundResource(R.color.orange_button);
			break;
		case Categories.PERSONAS:
			setBackgroundResource(R.color.yellow_button);
			break;
		case Categories.ADJETIVOS:
			setBackgroundResource(R.color.blue_button);
			break;
		case Categories.SOCIALES:
			setBackgroundResource(R.color.white_button);
			break;
		}
		
		switch(rw) {
		case RW.READ:
			setOnClickListener(new OnClickListener() {			
				public void onClick(View v) {
					if (phrase!=null && phrase.length()>0) {
						Toast.makeText(context, "Diciendo: " + phrase, Toast.LENGTH_LONG).show();
						ConversandoActivity.tts.speak(phrase, TextToSpeech.QUEUE_ADD, null);
					}
				}
			});
			break;
		case RW.WRITE:
			setOnClickListener(new OnClickListener() {			
				@Override
				public void onClick(View v) {
					ConversandoActivity.inputText.getText().insert(ConversandoActivity.inputText.getSelectionStart(),phrase + " ");

				}
			});
			break;
		
		}
		setText(phrase);
		setTextSize(18);
	}

	/** public MyButton(Context context, AttributeSet attrs) {

		 // this constructor will be called by inflater for creating object instance
	        super(context, attrs);
	 }**/

	/* public void SetClickButton(){
		 if (listener==null){
			 listener= new MyListener();
		 }
		 setOnClickListener(new MyListener());
		boxText = (EditText) findViewById(R.id.input_text);
			setOnClickListener(new OnClickListener() {			
				@Override
				public void onClick(View v ) {
					boxText.getText().insert(boxText.getSelectionStart(), ((MyButton)v).getText());

				}
			});
		}*/
}