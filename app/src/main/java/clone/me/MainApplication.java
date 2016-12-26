package clone.me;

import android.app.Application;
import android.support.v7.widget.Toolbar;

import com.facebook.stetho.Stetho;

import org.androidannotations.annotations.AfterInject;
import org.androidannotations.annotations.EApplication;
import org.androidannotations.annotations.ViewById;

import timber.log.Timber;
import uk.co.chrisjenx.calligraphy.CalligraphyConfig;

/**
 * Created by hongyew on 29/09/2016.
 */

@EApplication
public class MainApplication extends Application {


    @AfterInject
    public void init() {
        Timber.plant(new Timber.DebugTree());
        initializeCustomFont();
        Stetho.initializeWithDefaults(this);
    }


    private void initializeCustomFont() {
        CalligraphyConfig.initDefault(new CalligraphyConfig.Builder()
                .setDefaultFontPath("fonts/HelveticaNeue-Light.ttf")
                .setFontAttrId(R.attr.fontPath)
                .build());
    }

}
