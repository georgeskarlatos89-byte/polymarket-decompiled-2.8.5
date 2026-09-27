package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.view.ContextThemeWrapper;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class j3e extends ContextThemeWrapper {
    public final /* synthetic */ Context a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Configuration c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j3e(Context context, boolean z, Configuration configuration, Resources.Theme theme) {
        super(context, theme);
        this.a = context;
        this.b = z;
        this.c = configuration;
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final Resources getResources() {
        if (this.b) {
            Resources resources = this.a.getResources();
            return new Resources(resources.getAssets(), resources.getDisplayMetrics(), this.c);
        }
        Resources resources2 = super.getResources();
        resources2.getClass();
        return resources2;
    }
}
