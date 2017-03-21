package applicn.install.itg.lottie;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.airbnb.lottie.LottieAnimationView;

public class MainActivity extends AppCompatActivity
{
    LottieAnimationView animationView;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        animationView = (LottieAnimationView) findViewById(R.id.animation_view);
    }


    @Override
    protected void onResume()
    {
        super.onResume();
    }


    @Override
    protected void onDestroy()
    {

        super.onDestroy();
    }
}
