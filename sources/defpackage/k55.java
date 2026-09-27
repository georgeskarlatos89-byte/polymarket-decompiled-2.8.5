package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.view.LayoutInflater;
import com.polymarket.android.R;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public class k55 extends ContextWrapper {
    public static Configuration f;
    public int a;
    public Resources.Theme b;
    public LayoutInflater c;
    public Configuration d;
    public Resources e;

    public k55(Context context, int i) {
        super(context);
        this.a = i;
    }

    public final void a(Configuration configuration) {
        if (this.e == null) {
            if (this.d == null) {
                this.d = new Configuration(configuration);
                return;
            } else {
                dmk.n("Override configuration has already been set");
                return;
            }
        }
        dmk.n("getResources() or getAssets() has already been called");
    }

    @Override // android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    public final void b() {
        if (this.b == null) {
            this.b = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.b.setTo(theme);
            }
        }
        this.b.applyStyle(this.a, true);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final AssetManager getAssets() {
        return getResources().getAssets();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        Resources resources = this.e;
        if (resources == null) {
            Configuration configuration = this.d;
            if (configuration != null) {
                Configuration configuration2 = f;
                if (configuration2 == null) {
                    configuration2 = new Configuration();
                    configuration2.fontScale = 0.0f;
                    f = configuration2;
                }
                if (!configuration.equals(configuration2)) {
                    Resources resources2 = createConfigurationContext(this.d).getResources();
                    this.e = resources2;
                    return resources2;
                }
            }
            Resources resources3 = super.getResources();
            this.e = resources3;
            return resources3;
        }
        return resources;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Object getSystemService(String str) {
        if ("layout_inflater".equals(str)) {
            LayoutInflater layoutInflater = this.c;
            if (layoutInflater == null) {
                LayoutInflater cloneInContext = LayoutInflater.from(getBaseContext()).cloneInContext(this);
                this.c = cloneInContext;
                return cloneInContext;
            }
            return layoutInflater;
        }
        return getBaseContext().getSystemService(str);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Resources.Theme getTheme() {
        Resources.Theme theme = this.b;
        if (theme != null) {
            return theme;
        }
        if (this.a == 0) {
            this.a = R.style.Theme_AppCompat_Light;
        }
        b();
        return this.b;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i) {
        if (this.a != i) {
            this.a = i;
            b();
        }
    }

    public k55(Context context, Resources.Theme theme) {
        super(context);
        this.b = theme;
    }
}
