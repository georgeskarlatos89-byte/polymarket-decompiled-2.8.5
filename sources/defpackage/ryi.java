package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class ryi extends k55 {
    public final /* synthetic */ Context g;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ Configuration i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ryi(Context context, boolean z, Configuration configuration, Resources.Theme theme) {
        super(context, theme);
        this.g = context;
        this.h = z;
        this.i = configuration;
    }

    @Override // defpackage.k55, android.content.ContextWrapper, android.content.Context
    public final Resources getResources() {
        if (this.h) {
            Resources resources = this.g.getResources();
            return new Resources(resources.getAssets(), resources.getDisplayMetrics(), this.i);
        }
        return super.getResources();
    }
}
