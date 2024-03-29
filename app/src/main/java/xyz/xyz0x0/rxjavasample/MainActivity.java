package xyz.xyz0x0.rxjavasample;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.functions.Consumer;
import io.reactivex.rxjava3.schedulers.Schedulers;

public class MainActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    test1();
  }


  private void test1() {
    Observable.just(1)
        .observeOn(Schedulers.io())
        .subscribe(new Consumer<Integer>() {
          @Override public void accept(Integer integer) throws Throwable {

          }
        });
  }
}
