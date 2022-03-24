package de.codeyourapp.angrygfsimulator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.content.Intent;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import java.util.HashMap;
import java.util.Map;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        final RequestQueue MyRequestQueue = Volley.newRequestQueue(this);

        setContentView(R.layout.start);
        Button startbutton = findViewById(R.id.startbutton);
        startbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setContentView(R.layout.activity_main);


                final Button button_1_1 = findViewById(R.id.button_1_1);
                button_1_1.setOnClickListener(new View.OnClickListener() {
                    public void onClick(final View v) {
                        int duration = Toast.LENGTH_LONG;
                        String message = "You chose answer 1";
                        Toast toast = Toast.makeText(getApplicationContext(), message, duration);
                        setContentView(R.layout.question_2_1);
                        final Button button_2_1 = findViewById(R.id.button_2_1);
                        final Button button_2_2 = findViewById(R.id.button_2_2);
                        final Button button_2_3 = findViewById(R.id.button_2_3);
                        final Button button_2_4 = findViewById(R.id.button_2_4);
                        button_2_1.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                setContentView(R.layout.question_3_1_1);
                                final Button button_3_1 = findViewById(R.id.button_3_1);
                                final Button button_3_2 = findViewById(R.id.button_3_2);
                                final Button button_3_3 = findViewById(R.id.button_3_3);
                                final Button button_3_4 = findViewById(R.id.button_3_4);
                                button_3_1.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View view) {
                                        setContentView(R.layout.badend);
                                        final Button returnbad = findViewById(R.id.retrunbad);
                                        returnbad.setOnClickListener(new View.OnClickListener() {
                                            @Override
                                            public void onClick(View view) {
                                                recreate();
                                            }
                                        });
                                    }
                                });
                                button_3_2.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View view) {
                                        setContentView(R.layout.goodend);
                                        final Button returngood = findViewById(R.id.retrungood);
                                        final Button nextlevelbutton = findViewById(R.id.nextlevelbutton);
                                        returngood.setOnClickListener(new View.OnClickListener() {
                                            @Override
                                            public void onClick(View view) {
                                                recreate();
                                            }
                                        });
                                        nextlevelbutton.setOnClickListener(new View.OnClickListener() {
                                            @Override
                                            public void onClick(View view) {

                                            }
                                        });
                                    }
                                });
                                button_3_3.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View view) {
                                        setContentView(R.layout.goodend);
                                        final Button returngood = findViewById(R.id.retrungood);
                                        final Button nextlevelbutton = findViewById(R.id.nextlevelbutton);
                                        returngood.setOnClickListener(new View.OnClickListener() {
                                            @Override
                                            public void onClick(View view) {
                                                recreate();
                                            }
                                        });
                                        nextlevelbutton.setOnClickListener(new View.OnClickListener() {
                                            @Override
                                            public void onClick(View view) {
                                                Intent explicitIntent = new Intent(MainActivity.this, secondlevel.class);
                                                startActivity(explicitIntent);
                                            }
                                        });
                                    }
                                });
                                button_3_4.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View view) {
                                        setContentView(R.layout.badend);
                                        final Button returnbad = findViewById(R.id.retrunbad);
                                        returnbad.setOnClickListener(new View.OnClickListener() {
                                            @Override
                                            public void onClick(View view) {
                                                recreate();
                                            }
                                        });
                                    }
                                });

                            }
                        });
                        button_2_2.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                setContentView(R.layout.question_3_1_2);
                                final Button button_3_1_1_1 = findViewById(R.id.button_3_1_1_1);
                                final Button button_3_1_1_2 = findViewById(R.id.button_3_1_1_2);
                                final Button button_3_1_1_3 = findViewById(R.id.button_3_1_1_3);
                                final Button button_3_1_1_4 = findViewById(R.id.button_3_1_1_4);
                                button_3_1_1_1.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View view) {
                                        setContentView(R.layout.badend);
                                        final Button returnbad = findViewById(R.id.retrunbad);
                                        returnbad.setOnClickListener(new View.OnClickListener() {
                                            @Override
                                            public void onClick(View view) {
                                                recreate();
                                            }
                                        });
                                    }
                                });
                                button_3_1_1_2.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View view) {
                                        setContentView(R.layout.goodend);
                                        final Button returngood = findViewById(R.id.retrungood);
                                        final Button nextlevelbutton = findViewById(R.id.nextlevelbutton);
                                        returngood.setOnClickListener(new View.OnClickListener() {
                                            @Override
                                            public void onClick(View view) {
                                                recreate();
                                            }
                                        });
                                        nextlevelbutton.setOnClickListener(new View.OnClickListener() {
                                            @Override
                                            public void onClick(View view) {
                                                Intent explicitIntent = new Intent(MainActivity.this, secondlevel.class);
                                                startActivity(explicitIntent);
                                            }
                                        });
                                    }
                                });
                                button_3_1_1_3.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View view) {
                                        setContentView(R.layout.badend);
                                        final Button returnbad = findViewById(R.id.retrunbad);
                                        returnbad.setOnClickListener(new View.OnClickListener() {
                                            @Override
                                            public void onClick(View view) {
                                                recreate();
                                            }
                                        });
                                    }
                                });
                                button_3_1_1_4.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View view) {
                                        setContentView(R.layout.badend);
                                        final Button returnbad = findViewById(R.id.retrunbad);
                                        returnbad.setOnClickListener(new View.OnClickListener() {
                                            @Override
                                            public void onClick(View view) {
                                                recreate();
                                            }
                                        });
                                    }
                                });
                            }
                        });
                        button_2_3.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                setContentView(R.layout.question_3_1_3);
                                final Button button_3_1_3_1 = findViewById(R.id.button_3_1_3_1);
                                final Button button_3_1_3_2 = findViewById(R.id.button_3_1_3_2);
                                final Button button_3_1_3_3 = findViewById(R.id.button_3_1_3_3);
                                final Button button_3_1_3_4 = findViewById(R.id.button_3_1_3_4);
                                button_3_1_3_1.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View view) {
                                        setContentView(R.layout.goodend);
                                        final Button returngood = findViewById(R.id.retrungood);
                                        final Button nextlevelbutton = findViewById(R.id.nextlevelbutton);
                                        returngood.setOnClickListener(new View.OnClickListener() {
                                            @Override
                                            public void onClick(View view) {
                                                recreate();
                                            }
                                        });
                                        nextlevelbutton.setOnClickListener(new View.OnClickListener() {
                                            @Override
                                            public void onClick(View view) {
                                                Intent explicitIntent = new Intent(MainActivity.this, secondlevel.class);
                                                startActivity(explicitIntent);
                                            }
                                        });
                                    }
                                });
                                button_3_1_3_2.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View view) {
                                        setContentView(R.layout.badend);
                                        final Button returnbad = findViewById(R.id.retrunbad);
                                        returnbad.setOnClickListener(new View.OnClickListener() {
                                            @Override
                                            public void onClick(View view) {
                                                recreate();
                                            }
                                        });
                                    }
                                });
                                button_3_1_3_3.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View view) {
                                        setContentView(R.layout.goodend);
                                        final Button returngood = findViewById(R.id.retrungood);
                                        final Button nextlevelbutton = findViewById(R.id.nextlevelbutton);
                                        returngood.setOnClickListener(new View.OnClickListener() {
                                            @Override
                                            public void onClick(View view) {
                                                recreate();
                                            }
                                        });
                                        nextlevelbutton.setOnClickListener(new View.OnClickListener() {
                                            @Override
                                            public void onClick(View view) {
                                                Intent explicitIntent = new Intent(MainActivity.this, secondlevel.class);
                                                startActivity(explicitIntent);
                                            }
                                        });
                                    }
                                });
                                button_3_1_3_4.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View view) {
                                        setContentView(R.layout.badend);
                                        final Button returnbad = findViewById(R.id.retrunbad);
                                        returnbad.setOnClickListener(new View.OnClickListener() {
                                            @Override
                                            public void onClick(View view) {
                                                recreate();
                                            }
                                        });
                                    }
                                });
                            }
                        });
                        button_2_4.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                setContentView(R.layout.question_3_1_4);
                                final Button button_3_1_4_1 = findViewById(R.id.button_3_1_4_1);
                                final Button button_3_1_4_2 = findViewById(R.id.button_3_1_4_2);
                                final Button button_3_1_4_3 = findViewById(R.id.button_3_1_4_3);
                                final Button button_3_1_4_4 = findViewById(R.id.button_3_1_4_4);
                                button_3_1_4_1.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View view) {
                                        setContentView(R.layout.badend);
                                        final Button returnbad = findViewById(R.id.retrunbad);
                                        returnbad.setOnClickListener(new View.OnClickListener() {
                                            @Override
                                            public void onClick(View view) {
                                                recreate();
                                            }
                                        });
                                    }
                                });
                                button_3_1_4_2.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View view) {
                                        setContentView(R.layout.badend);
                                        final Button returnbad = findViewById(R.id.retrunbad);
                                        returnbad.setOnClickListener(new View.OnClickListener() {
                                            @Override
                                            public void onClick(View view) {
                                                recreate();
                                            }
                                        });
                                    }
                                });
                                button_3_1_4_3.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View view) {
                                        setContentView(R.layout.goodend);
                                        final Button returngood = findViewById(R.id.retrungood);
                                        final Button nextlevelbutton = findViewById(R.id.nextlevelbutton);
                                        returngood.setOnClickListener(new View.OnClickListener() {
                                            @Override
                                            public void onClick(View view) {
                                                recreate();
                                            }
                                        });nextlevelbutton.setOnClickListener(new View.OnClickListener() {
                                            @Override
                                            public void onClick(View view) {
                                                Intent explicitIntent = new Intent(MainActivity.this, secondlevel.class);
                                                startActivity(explicitIntent);
                                            }
                                        });
                                    }
                                });
                                button_3_1_4_4.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View view) {
                                        setContentView(R.layout.badend);
                                        final Button returnbad = findViewById(R.id.retrunbad);
                                        returnbad.setOnClickListener(new View.OnClickListener() {
                                            @Override
                                            public void onClick(View view) {
                                                recreate();
                                            }
                                        });
                                    }
                                });
                            }
                        });
                    }
                });
                final Button button_1_2 = findViewById(R.id.button_1_2);
                button_1_2.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        //int duration = Toast.LENGTH_LONG;
                        //String message = "You chose answer 2";
                        //Toast toast = Toast.makeText(getApplicationContext(),message, duration);
                        setContentView(R.layout.question_2_2);

                        final Button button_2_1 = findViewById(R.id.button_2_1);
                        final Button button_2_2 = findViewById(R.id.button_2_2);
                        final Button button_2_3 = findViewById(R.id.button_2_3);
                        final Button button_2_4 = findViewById(R.id.button_2_4);
                        button_2_1.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                setContentView(R.layout.goodend);
                                final Button returngood = findViewById(R.id.retrungood);
                                final Button nextlevelbutton = findViewById(R.id.nextlevelbutton);
                                returngood.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View view) {
                                        recreate();
                                    }
                                });
                                nextlevelbutton.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View view) {
                                        Intent explicitIntent = new Intent(MainActivity.this, secondlevel.class);
                                        startActivity(explicitIntent);
                                    }
                                });

                            }
                        });
                        button_2_2.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                setContentView(R.layout.badend);
                                final Button returnbad = findViewById(R.id.retrunbad);
                                returnbad.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View view) {
                                        recreate();
                                    }
                                });
                            }
                        });
                        button_2_3.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                setContentView(R.layout.goodend);
                                final Button returngood = findViewById(R.id.retrungood);
                                final Button nextlevelbutton = findViewById(R.id.nextlevelbutton);
                                returngood.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View view) {
                                        recreate();
                                    }
                                });
                                nextlevelbutton.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View view) {
                                        Intent explicitIntent = new Intent(MainActivity.this, secondlevel.class);
                                        startActivity(explicitIntent);
                                    }
                                });
                            }
                        });
                        button_2_4.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                setContentView(R.layout.badend);
                                final Button returnbad = findViewById(R.id.retrunbad);
                                returnbad.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View view) {
                                        recreate();
                                    }
                                });
                            }
                        });

                    }
                });

                final Button button_1_3 = findViewById(R.id.button_1_3);
                button_1_3.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        //int duration = Toast.LENGTH_LONG;
                        //String message = "You chose answer 3";
                        //Toast toast = Toast.makeText(getApplicationContext(),message, duration);
                        setContentView(R.layout.question_2_3);

                        final Button button_2_1 = findViewById(R.id.button_2_1);
                        final Button button_2_2 = findViewById(R.id.button_2_2);
                        final Button button_2_3 = findViewById(R.id.button_2_3);
                        final Button button_2_4 = findViewById(R.id.button_2_4);
                        button_2_1.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                setContentView(R.layout.question_3_3_1);
                                final Button button_3_3_1_1 = findViewById(R.id.button_3_3_1_1);
                                final Button button_3_3_1_2 = findViewById(R.id.button_3_3_1_2);
                                final Button button_3_3_1_3 = findViewById(R.id.button_3_3_1_3);
                                final Button button_3_3_1_4 = findViewById(R.id.button_3_3_1_4);
                                button_3_3_1_1.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View view) {
                                        setContentView(R.layout.goodend);
                                        final Button returngood = findViewById(R.id.retrungood);
                                        final Button nextlevelbutton = findViewById(R.id.nextlevelbutton);
                                        returngood.setOnClickListener(new View.OnClickListener() {
                                            @Override
                                            public void onClick(View view) {
                                                recreate();
                                            }
                                        });
                                        nextlevelbutton.setOnClickListener(new View.OnClickListener() {
                                            @Override
                                            public void onClick(View view) {
                                                Intent explicitIntent = new Intent(MainActivity.this, secondlevel.class);
                                                startActivity(explicitIntent);
                                            }
                                        });
                                    }
                                });
                                button_3_3_1_2.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View view) {
                                        setContentView(R.layout.badend);
                                        final Button returnbad = findViewById(R.id.retrunbad);
                                        returnbad.setOnClickListener(new View.OnClickListener() {
                                            @Override
                                            public void onClick(View view) {
                                                recreate();
                                            }
                                        });
                                    }
                                });
                                button_3_3_1_3.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View view) {
                                        setContentView(R.layout.goodend);
                                        final Button returngood = findViewById(R.id.retrungood);
                                        final Button nextlevelbutton = findViewById(R.id.nextlevelbutton);
                                        returngood.setOnClickListener(new View.OnClickListener() {
                                            @Override
                                            public void onClick(View view) {
                                                recreate();
                                            }
                                        });
                                        nextlevelbutton.setOnClickListener(new View.OnClickListener() {
                                            @Override
                                            public void onClick(View view) {
                                                Intent explicitIntent = new Intent(MainActivity.this, secondlevel.class);
                                                startActivity(explicitIntent);
                                            }
                                        });
                                    }
                                });
                                button_3_3_1_4.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View view) {
                                        setContentView(R.layout.badend);
                                        final Button returnbad = findViewById(R.id.retrunbad);
                                        returnbad.setOnClickListener(new View.OnClickListener() {
                                            @Override
                                            public void onClick(View view) {
                                                recreate();
                                            }
                                        });
                                    }
                                });
                            }
                        });
                        button_2_2.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                setContentView(R.layout.question_3_3_2);
                                final Button button_3_3_2_1 = findViewById(R.id.button_3_3_2_1);
                                final Button button_3_3_2_2 = findViewById(R.id.button_3_3_2_2);
                                final Button button_3_3_2_3 = findViewById(R.id.button_3_3_2_3);
                                final Button button_3_3_2_4 = findViewById(R.id.button_3_3_2_4);
                                button_3_3_2_1.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View view) {
                                        setContentView(R.layout.goodend);
                                        final Button returngood = findViewById(R.id.retrungood);
                                        final Button nextlevelbutton = findViewById(R.id.nextlevelbutton);
                                        returngood.setOnClickListener(new View.OnClickListener() {
                                            @Override
                                            public void onClick(View view) {
                                                recreate();
                                            }
                                        });
                                        nextlevelbutton.setOnClickListener(new View.OnClickListener() {
                                            @Override
                                            public void onClick(View view) {
                                                Intent explicitIntent = new Intent(MainActivity.this, secondlevel.class);
                                                startActivity(explicitIntent);
                                            }
                                        });
                                    }
                                });
                                button_3_3_2_2.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View view) {
                                        setContentView(R.layout.badend);
                                        final Button returnbad = findViewById(R.id.retrunbad);
                                        returnbad.setOnClickListener(new View.OnClickListener() {
                                            @Override
                                            public void onClick(View view) {
                                                recreate();
                                            }
                                        });
                                    }
                                });
                                button_3_3_2_3.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View view) {
                                        setContentView(R.layout.goodend);
                                        final Button returngood = findViewById(R.id.retrungood);
                                        final Button nextlevelbutton = findViewById(R.id.nextlevelbutton);
                                        returngood.setOnClickListener(new View.OnClickListener() {
                                            @Override
                                            public void onClick(View view) {
                                                recreate();
                                            }
                                        });
                                        nextlevelbutton.setOnClickListener(new View.OnClickListener() {
                                            @Override
                                            public void onClick(View view) {
                                                Intent explicitIntent = new Intent(MainActivity.this, secondlevel.class);
                                                startActivity(explicitIntent);
                                            }
                                        });
                                    }
                                });
                                button_3_3_2_4.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View view) {
                                        setContentView(R.layout.badend);
                                        final Button returnbad = findViewById(R.id.retrunbad);
                                        returnbad.setOnClickListener(new View.OnClickListener() {
                                            @Override
                                            public void onClick(View view) {
                                                recreate();
                                            }
                                        });
                                    }
                                });
                            }
                        });
                        button_2_3.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                setContentView(R.layout.question_3_3_3);
                                final Button button_3_3_3_1 = findViewById(R.id.button_3_3_3_1);
                                final Button button_3_3_3_2 = findViewById(R.id.button_3_3_3_2);
                                final Button button_3_3_3_3 = findViewById(R.id.button_3_3_3_3);
                                final Button button_3_3_3_4 = findViewById(R.id.button_3_3_3_4);
                                button_3_3_3_1.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View view) {
                                        setContentView(R.layout.badend);
                                        final Button returnbad = findViewById(R.id.retrunbad);
                                        returnbad.setOnClickListener(new View.OnClickListener() {
                                            @Override
                                            public void onClick(View view) {
                                                recreate();
                                            }
                                        });
                                    }
                                });
                                button_3_3_3_2.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View view) {
                                        setContentView(R.layout.badend);
                                        final Button returnbad = findViewById(R.id.retrunbad);
                                        returnbad.setOnClickListener(new View.OnClickListener() {
                                            @Override
                                            public void onClick(View view) {
                                                recreate();
                                            }
                                        });
                                    }
                                });
                                button_3_3_3_3.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View view) {
                                        setContentView(R.layout.badend);
                                        final Button returnbad = findViewById(R.id.retrunbad);
                                        returnbad.setOnClickListener(new View.OnClickListener() {
                                            @Override
                                            public void onClick(View view) {
                                                recreate();
                                            }
                                        });
                                    }
                                });
                                button_3_3_3_4.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View view) {
                                        setContentView(R.layout.goodend);
                                        final Button returngood = findViewById(R.id.retrungood);
                                        final Button nextlevelbutton = findViewById(R.id.nextlevelbutton);
                                        returngood.setOnClickListener(new View.OnClickListener() {
                                            @Override
                                            public void onClick(View view) {
                                                recreate();
                                            }
                                        });
                                        nextlevelbutton.setOnClickListener(new View.OnClickListener() {
                                            @Override
                                            public void onClick(View view) {
                                                Intent explicitIntent = new Intent(MainActivity.this, secondlevel.class);
                                                startActivity(explicitIntent);
                                            }
                                        });
                                    }
                                });
                            }
                        });
                        button_2_4.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                setContentView(R.layout.question_3_3_4);
                                final Button button_3_3_4_1 = findViewById(R.id.button_3_3_4_1);
                                final Button button_3_3_4_2 = findViewById(R.id.button_3_3_4_2);
                                final Button button_3_3_4_3 = findViewById(R.id.button_3_3_4_3);
                                final Button button_3_3_4_4 = findViewById(R.id.button_3_3_4_4);
                                button_3_3_4_1.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View view) {
                                        setContentView(R.layout.badend);
                                        final Button returnbad = findViewById(R.id.retrunbad);
                                        returnbad.setOnClickListener(new View.OnClickListener() {
                                            @Override
                                            public void onClick(View view) {
                                                recreate();
                                            }
                                        });
                                    }
                                });
                                button_3_3_4_2.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View view) {
                                        setContentView(R.layout.goodend);
                                        final Button returngood = findViewById(R.id.retrungood);
                                        final Button nextlevelbutton = findViewById(R.id.nextlevelbutton);
                                        returngood.setOnClickListener(new View.OnClickListener() {
                                            @Override
                                            public void onClick(View view) {
                                                recreate();
                                            }
                                        });
                                        nextlevelbutton.setOnClickListener(new View.OnClickListener() {
                                            @Override
                                            public void onClick(View view) {
                                                Intent explicitIntent = new Intent(MainActivity.this, secondlevel.class);
                                                startActivity(explicitIntent);
                                            }
                                        });
                                    }
                                });
                                button_3_3_4_3.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View view) {
                                        setContentView(R.layout.goodend);
                                        final Button returngood = findViewById(R.id.retrungood);
                                        final Button nextlevelbutton = findViewById(R.id.nextlevelbutton);
                                        returngood.setOnClickListener(new View.OnClickListener() {
                                            @Override
                                            public void onClick(View view) {
                                                recreate();
                                            }
                                        });
                                        nextlevelbutton.setOnClickListener(new View.OnClickListener() {
                                            @Override
                                            public void onClick(View view) {
                                                Intent explicitIntent = new Intent(MainActivity.this, secondlevel.class);
                                                startActivity(explicitIntent);
                                            }
                                        });
                                    }
                                });
                                button_3_3_4_4.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View view) {
                                        setContentView(R.layout.badend);
                                        final Button returnbad = findViewById(R.id.retrunbad);
                                        returnbad.setOnClickListener(new View.OnClickListener() {
                                            @Override
                                            public void onClick(View view) {
                                                recreate();
                                            }
                                        });
                                    }
                                });
                            }
                        });

                    }
                });
                final Button button_1_4 = findViewById(R.id.button_1_4);
                button_1_4.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        //int duration = Toast.LENGTH_LONG;
                        //String message = "You chose answer 4";
                        //Toast toast = Toast.makeText(getApplicationContext(),message, duration);
                        setContentView(R.layout.question_2_4);

                        final Button button_2_1 = findViewById(R.id.button_2_1);
                        final Button button_2_2 = findViewById(R.id.button_2_2);
                        final Button button_2_3 = findViewById(R.id.button_2_3);
                        final Button button_2_4 = findViewById(R.id.button_2_4);
                        button_2_1.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                setContentView(R.layout.question_3_4_1);
                                final Button button_3_4_1_1 = findViewById(R.id.button_3_4_1_1);
                                final Button button_3_4_1_2 = findViewById(R.id.button_3_4_1_2);
                                final Button button_3_4_1_3 = findViewById(R.id.button_3_4_1_3);
                                final Button button_3_4_1_4 = findViewById(R.id.button_3_4_1_4);
                                button_3_4_1_1.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View view) {
                                        setContentView(R.layout.badend);
                                        final Button returnbad = findViewById(R.id.retrunbad);
                                        returnbad.setOnClickListener(new View.OnClickListener() {
                                            @Override
                                            public void onClick(View view) {
                                                recreate();
                                            }
                                        });
                                    }
                                });
                                button_3_4_1_2.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View view) {
                                        setContentView(R.layout.goodend);
                                        final Button returngood = findViewById(R.id.retrungood);
                                        final Button nextlevelbutton = findViewById(R.id.nextlevelbutton);
                                        returngood.setOnClickListener(new View.OnClickListener() {
                                            @Override
                                            public void onClick(View view) {
                                                recreate();
                                            }
                                        });
                                        nextlevelbutton.setOnClickListener(new View.OnClickListener() {
                                            @Override
                                            public void onClick(View view) {
                                                Intent explicitIntent = new Intent(MainActivity.this, secondlevel.class);
                                                startActivity(explicitIntent);
                                            }
                                        });
                                    }
                                });
                                button_3_4_1_3.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View view) {
                                        setContentView(R.layout.goodend);
                                        final Button returngood = findViewById(R.id.retrungood);
                                        final Button nextlevelbutton = findViewById(R.id.nextlevelbutton);
                                        returngood.setOnClickListener(new View.OnClickListener() {
                                            @Override
                                            public void onClick(View view) {
                                                recreate();
                                            }
                                        });
                                        nextlevelbutton.setOnClickListener(new View.OnClickListener() {
                                            @Override
                                            public void onClick(View view) {
                                                Intent explicitIntent = new Intent(MainActivity.this, secondlevel.class);
                                                startActivity(explicitIntent);
                                            }
                                        });
                                    }
                                });
                                button_3_4_1_4.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View view) {
                                        setContentView(R.layout.badend);
                                        final Button returnbad = findViewById(R.id.retrunbad);
                                        returnbad.setOnClickListener(new View.OnClickListener() {
                                            @Override
                                            public void onClick(View view) {
                                                recreate();
                                            }
                                        });
                                    }
                                });
                            }
                        });
                        button_2_2.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                setContentView(R.layout.question_3_4_2);
                                final Button button_3_4_2_1 = findViewById(R.id.button_3_4_2_1);
                                final Button button_3_4_2_2 = findViewById(R.id.button_3_4_2_2);
                                final Button button_3_4_2_3 = findViewById(R.id.button_3_4_2_3);
                                final Button button_3_4_2_4 = findViewById(R.id.button_3_4_2_4);
                                button_3_4_2_1.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View view) {
                                        setContentView(R.layout.goodend);
                                        final Button returngood = findViewById(R.id.retrungood);
                                        final Button nextlevelbutton = findViewById(R.id.nextlevelbutton);
                                        returngood.setOnClickListener(new View.OnClickListener() {
                                            @Override
                                            public void onClick(View view) {
                                                recreate();
                                            }
                                        });
                                        nextlevelbutton.setOnClickListener(new View.OnClickListener() {
                                            @Override
                                            public void onClick(View view) {
                                                Intent explicitIntent = new Intent(MainActivity.this, secondlevel.class);
                                                startActivity(explicitIntent);
                                            }
                                        });
                                    }
                                });
                                button_3_4_2_2.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View view) {
                                        setContentView(R.layout.badend);
                                        final Button returnbad = findViewById(R.id.retrunbad);
                                        returnbad.setOnClickListener(new View.OnClickListener() {
                                            @Override
                                            public void onClick(View view) {
                                                recreate();
                                            }
                                        });
                                    }
                                });
                                button_3_4_2_3.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View view) {
                                        setContentView(R.layout.badend);
                                        final Button returnbad = findViewById(R.id.retrunbad);
                                        returnbad.setOnClickListener(new View.OnClickListener() {
                                            @Override
                                            public void onClick(View view) {
                                                recreate();
                                            }
                                        });
                                    }
                                });
                                button_3_4_2_4.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View view) {
                                        setContentView(R.layout.badend);
                                        final Button returnbad = findViewById(R.id.retrunbad);
                                        returnbad.setOnClickListener(new View.OnClickListener() {
                                            @Override
                                            public void onClick(View view) {
                                                recreate();
                                            }
                                        });
                                    }
                                });

                            }
                        });
                        button_2_3.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                setContentView(R.layout.question_3_4_3);
                                final Button button_3_4_3_1 = findViewById(R.id.button_3_4_3_1);
                                button_3_4_3_1.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View view) {
                                        recreate();
                                    }
                                });
                                //thread badend

                            }
                        });
                        button_2_4.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                setContentView(R.layout.question_3_4_4);
                                final Button button_3_4_4_1 = findViewById(R.id.button_3_4_4_1);
                                final Button button_3_4_4_2 = findViewById(R.id.button_3_4_4_2);
                                final Button button_3_4_4_3 = findViewById(R.id.button_3_4_4_3);
                                final Button button_3_4_4_4 = findViewById(R.id.button_3_4_4_4);
                                button_3_4_4_1.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View view) {
                                        setContentView(R.layout.badend);
                                        final Button returnbad = findViewById(R.id.retrunbad);
                                        returnbad.setOnClickListener(new View.OnClickListener() {
                                            @Override
                                            public void onClick(View view) {
                                                recreate();
                                            }
                                        });
                                    }
                                });
                                button_3_4_4_2.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View view) {
                                        setContentView(R.layout.badend);
                                        final Button returnbad = findViewById(R.id.retrunbad);
                                        returnbad.setOnClickListener(new View.OnClickListener() {
                                            @Override
                                            public void onClick(View view) {
                                                recreate();
                                            }
                                        });
                                    }
                                });
                                button_3_4_4_3.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View view) {
                                        setContentView(R.layout.goodend);
                                        final Button returngood = findViewById(R.id.retrungood);
                                        final Button nextlevelbutton = findViewById(R.id.nextlevelbutton);
                                        returngood.setOnClickListener(new View.OnClickListener() {
                                            @Override
                                            public void onClick(View view) {
                                                recreate();
                                            }
                                        });
                                        nextlevelbutton.setOnClickListener(new View.OnClickListener() {
                                            @Override
                                            public void onClick(View view) {
                                                Intent explicitIntent = new Intent(MainActivity.this, secondlevel.class);
                                                startActivity(explicitIntent);



                                            }

                                        });
                                    }
                                });
                                button_3_4_4_4.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View view) {
                                        setContentView(R.layout.badend);
                                        final Button returnbad = findViewById(R.id.retrunbad);

                                        returnbad.setOnClickListener(new View.OnClickListener() {
                                            @Override
                                            public void onClick(View view) {
                                              recreate();
                                            }
                                        });

                                    }
                                });
                            }
                        });

                    }
                });
            }
        });
    }

}
