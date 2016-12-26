package clone.me.ui;

import android.support.v7.widget.Toolbar;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.ViewById;

import clone.me.R;

@EActivity(R.layout.main_activity)
public class MainActivity extends AbstractDrawerActivity {


    @ViewById(R.id.toolbar)
    Toolbar toolbar;

    @AfterViews
    protected void init() {
        super.init();
        getSupportActionBar().setTitle("Template App");
    }

    @Override
    protected Toolbar getToolbar() {
        return toolbar;
    }

}
