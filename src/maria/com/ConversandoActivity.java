package maria.com;



import java.util.List;


import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.speech.tts.TextToSpeech.OnInitListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Toast;

 
public class ConversandoActivity extends Activity  implements OnInitListener {
    	
    	private int MY_DATA_CHECK_CODE = 0;
    	
    	static TextToSpeech tts;
    	
    	public static EditText inputText;
    	private Button deleteButton;
    	
    	private Button whatButton;
    	private Button thinkButton;
    	private Button needButton;
    	private Button wantButton;
    	private Button hopeButton;
    	private Button beButton;
    	private Button haveButton;
    	private Button yesButton;
    	private Button noButton;
    	
    	private Button whoButton;
    	private Button miButton;
    	private Button youButton;
    	private Button allButton;
    	private Button nobodyButton;
    	private Button itButton;
    	private Button knowButton;
    	private Button hiButton;
    	private Button talButton;
    	private Button thanksButton;
    	
    	private Button whenButton;
    	private Button isButton;
    	private Button heButton;
    	private Button sheButton;
    	private Button meButton;
    	private Button hurtButton;
    	private Button likeButton;
    	private Button fineButton;
    	private Button pleaseButton;
    	private Button sorryButton;
    	
    	private Button howButton;
    	private Button fewButton;
    	private Button veryButton;
    	private Button muchButton;
    	private Button nothingButton;
    	private Button moreButton;
    	private Button lessButton;
    	private Button maybeButton;
    	private Button okButton;
    	private Button careButton;
    	
    	private Button whereButton;
    	private Button hereButton;
    	private Button inButton;
    	private Button bringButton;
    	private Button comeButton;
    	private Button goButton;
    	private Button doButton;
      	private Button speakButton;

    	private LinearLayout ln;


    	private Cursor cursor;
    	//private ListView lista;

    	private List<String> frases;
    	public static ConversandoActivity miActividad=null;

 
        public void onCreate(Bundle savedInstanceState) {
    		
            super.onCreate(savedInstanceState);
            miActividad=this;
            setContentView(R.layout.conversando_main);
            
            
            inputText = (EditText) findViewById(R.id.input_text);
            deleteButton = (Button)findViewById(R.id.delete_button);

            speakButton = (Button) findViewById(R.id.speak_button);
            
    
            
            whatButton = (Button)findViewById(R.id.what_button);
            thinkButton = (Button)findViewById(R.id.think_button);
            
            //thinkButton.getBackground().setColorFilter(0xF7FE2E, PorterDuff.Mode.MULTIPLY);
				//thinkButton.setBackgroundColor(0xF2FE2E);
				
				
            needButton = (Button)findViewById(R.id.need_button);
            
            //needButton.setBackgroundColor(Color.argb( 0	,0, 255, 127));
            
            wantButton = (Button)findViewById(R.id.want_button);
            hopeButton = (Button)findViewById(R.id.hope_button);
            beButton = (Button)findViewById(R.id.be_button);
            haveButton = (Button)findViewById(R.id.have_button);
            yesButton = (Button)findViewById(R.id.yes_button);
            noButton = (Button)findViewById(R.id.no_button);
            
            whoButton = (Button)findViewById(R.id.who_button);
            miButton = (Button)findViewById(R.id.mi_button);
           
            youButton = (Button)findViewById(R.id.you_button);
  
            allButton = (Button)findViewById(R.id.all_button);
            nobodyButton = (Button)findViewById(R.id.nobody_button);
            itButton = (Button)findViewById(R.id.it_button);
            knowButton = (Button)findViewById(R.id.know_button);
            hiButton = (Button)findViewById(R.id.hi_button);
            talButton = (Button)findViewById(R.id.tal_button);
            thanksButton = (Button)findViewById(R.id.thanks_button);
            
           
            whenButton = (Button)findViewById(R.id.when_button);
            isButton = (Button)findViewById(R.id.is_button);
            heButton = (Button)findViewById(R.id.he_button);
            sheButton = (Button)findViewById(R.id.she_button);
            meButton = (Button)findViewById(R.id.me_button);
            hurtButton = (Button)findViewById(R.id.hurt_button);
            likeButton = (Button)findViewById(R.id.like_button);
            fineButton = (Button)findViewById(R.id.fine_button);
            pleaseButton = (Button)findViewById(R.id.please_button);
            sorryButton = (Button)findViewById(R.id.sorry_button);
            
            howButton = (Button)findViewById(R.id.how_button);
            fewButton = (Button)findViewById(R.id.few_button);
            veryButton = (Button)findViewById(R.id.very_button);
            muchButton = (Button)findViewById(R.id.much_button);
            nothingButton = (Button)findViewById(R.id.nothing_button);
            moreButton = (Button)findViewById(R.id.more_button);
            lessButton = (Button)findViewById(R.id.less_button);
            maybeButton = (Button)findViewById(R.id.maybe_button);
            okButton = (Button)findViewById(R.id.ok_button);
            careButton = (Button)findViewById(R.id.care_button);
   
            whereButton = (Button)findViewById(R.id.where_button); 
            hereButton = (Button)findViewById(R.id.here_button);
            inButton = (Button)findViewById(R.id.sorry_button);
            bringButton = (Button)findViewById(R.id.bring_button);
            comeButton = (Button)findViewById(R.id.come_button);
            goButton = (Button)findViewById(R.id.go_button);
            doButton = (Button)findViewById(R.id.do_button);
        
            whatButton = (Button)findViewById(R.id.what_button);
            thinkButton = (Button)findViewById(R.id.think_button);

				
            ClickButton(whatButton);
            ClickButton(thinkButton);
            ClickButton(needButton);

            ClickButton(wantButton);  
            ClickButton(hopeButton);
            ClickButton(beButton); 
            ClickButton(haveButton); 
            
            ClickButton(whoButton); 
            ClickButton(miButton);
            ClickButton(youButton);
            ClickButton(allButton);
            ClickButton(nobodyButton);
            ClickButton(itButton);
            ClickButton(knowButton);
            ClickButton(hiButton);
            ClickButton(talButton);
            ClickButton(thanksButton);
            
           
            ClickButton(whenButton);
            ClickButton(isButton);
            ClickButton(heButton);
            ClickButton(sheButton);
            ClickButton(meButton);
            ClickButton(hurtButton);
            ClickButton(likeButton);
            ClickButton(fineButton);
            ClickButton(pleaseButton);
            ClickButton(sorryButton);
            
            ClickButton(howButton);
            ClickButton(fewButton);
            ClickButton(veryButton);
            ClickButton(muchButton);
            ClickButton(nothingButton);
            ClickButton(moreButton);
            ClickButton(lessButton);
            ClickButton(maybeButton);
            ClickButton(okButton);
            ClickButton(careButton);
   
            ClickButton(whereButton); 
            ClickButton(hereButton);
            ClickButton(inButton);
            ClickButton(bringButton);
            ClickButton(comeButton);
            ClickButton(goButton);
            ClickButton(doButton);
           
 
      	  ln=(LinearLayout)this.findViewById(R.id.list);

		/*
		 * These are special buttons they have a non ordinary behaviour
		 */
      	  speakButton.setOnClickListener(new OnClickListener() {			

      		  public void onClick(View v) {
      			  String text = inputText.getText().toString();
      			  if (text!=null && text.length()>0) {
      				  Toast.makeText(ConversandoActivity.this, "Diciendo: " + text, Toast.LENGTH_LONG).show();
      				  tts.speak(text, TextToSpeech.QUEUE_ADD, null);
      			  }
      		  }
      	  });

      	  noButton.setOnClickListener(new OnClickListener() {			
      		  @Override
      		  public void onClick(View v) {
      			  String text = "No";
      			  Toast.makeText(ConversandoActivity.this, "Diciendo: " + text, Toast.LENGTH_LONG).show();
      			  tts.speak(text, TextToSpeech.QUEUE_ADD, null);

      		  }

      	  });
      	  yesButton.setOnClickListener(new OnClickListener() {			
      		  @Override
      		  public void onClick(View v) {
      			  String text = "S�";
      			  Toast.makeText(ConversandoActivity.this, "Diciendo: " + text, Toast.LENGTH_LONG).show();
      			  tts.speak(text, TextToSpeech.QUEUE_ADD, null);

      		  }

      	  });
      	  

      	  deleteButton.setOnClickListener(new OnClickListener() {			

      		  public void onClick(View v ) {
      			  inputText.selectAll();
      			  inputText.setText("");

      		  }
      	  });


      	 //Launching Text to Speech Engine
      	  Intent checkIntent = new Intent();
      	  checkIntent.setAction(TextToSpeech.Engine.ACTION_CHECK_TTS_DATA);
      	  startActivityForResult(checkIntent, MY_DATA_CHECK_CODE);
      	  
      	 //Recovers data saved in the DataBase
      	  FrasesSQLHelper dbHelper = new FrasesSQLHelper(this);
      	  
      	  setFrases(dbHelper.getAllPhrases());
     
      	  
      	  cursor = dbHelper.getAllData();
      	  
      	  if (cursor.moveToFirst()) {
                do {
                    MyButton pruebaCButton = new MyButton(cursor.getInt(0), cursor.getString(1), cursor.getInt(2), this);
                    ln.addView(pruebaCButton);
                } while (cursor.moveToNext());
            }
        }
        

        //Saves new data in the DataBase & pops it up
        public void savePhrase (View view){

      	  FrasesSQLHelper db = new FrasesSQLHelper(this); 

      	  String frasecica=inputText.getText().toString(); //frasecica is my inputText's name
      	  db.addPhrase(frasecica, Categories.OTHER, 1);

      	  Button vista=new Button(this, null); //adds a new button with new data into layout
      	  vista.setText(frasecica);
      	  ln.addView(vista);
      	  ClickButton(vista);

      	  //.notifyDataSetChanged():

      	  Toast toast= Toast.makeText(getApplicationContext(),"Frase Guardada", Toast.LENGTH_SHORT);
      	  toast.show();


        }
        
        /*
         * This methods gets phrases from the list and places them back
         */
        public List<String> getFrases() {
			return frases;
		}


		public void setFrases(List<String> frases) {
			this.frases = frases;
		}


		/**
         * This method is used for ordinary button
         */
        public void ClickButton(Button boton){

      	  boton.setOnClickListener(new OnClickListener() {			
      		  @Override
      		  public void onClick(View v) {
      			  inputText.getText().insert(inputText.getSelectionStart(),((Button)v).getText()+ " ");

      		  }
      	  });
        }

        /*
         * This method is for TTS to work
         */

        protected void onActivityResult(int requestCode, int resultCode, Intent data) {
      	  if (requestCode == MY_DATA_CHECK_CODE) {
      		  if (resultCode == TextToSpeech.Engine.CHECK_VOICE_DATA_PASS) {
      			  //crea la instancia del TTS
      			  tts = new TextToSpeech(this, this);
      		  } 
      		  else {
      			  // falta informaci�n, instala
      			  Intent installIntent = new Intent();
      			  installIntent.setAction(TextToSpeech.Engine.ACTION_INSTALL_TTS_DATA);
      			  startActivity(installIntent);
      		  }
      	  }


        }

        /**
         * These methods are to start TTS service and to shut it down. 
         */
        public void onInit(int status) {		
      	  if (status == TextToSpeech.SUCCESS) {
      		  Toast.makeText(ConversandoActivity.this, 
      				  "Text-To-Speech engine se ha inicializado", Toast.LENGTH_LONG).show();
      	  }
      	  else if (status == TextToSpeech.ERROR) {
      		  Toast.makeText(ConversandoActivity.this, 
      				  "Error incicializando Text-To-Speech engine", Toast.LENGTH_LONG).show();
      	  }
        }

        public void onDestroy() {
      	  // Don't forget to shutdown! si no, no permite a otras aplicaciones usar TTS
      	  if (tts != null) {
      		  tts.stop();
      		  tts.shutdown();
      	  }
      	  super.onDestroy();
        }
      

        /*
         * If user tries to leave the app, this Dialog confirms it
         * @see android.app.Activity#onBackPressed()
         */
@Override
		public void onBackPressed() {
		    new AlertDialog.Builder(this)
		        .setIcon(android.R.drawable.ic_dialog_alert)
		        .setTitle("Salir")
		        .setMessage("¿Desea salir de la aplicación?")
		        .setPositiveButton("Sí", new DialogInterface.OnClickListener()
		    {
		        @Override
		        public void onClick(DialogInterface dialog, int which) {
		            finish();    
		        }
		
		    })
		    .setNegativeButton("No", null)
		    .show();
		}
}
    
    
    