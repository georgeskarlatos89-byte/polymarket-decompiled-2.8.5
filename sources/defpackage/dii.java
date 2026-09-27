package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class dii extends View {
    public final /* synthetic */ ViewGroup a;
    public final /* synthetic */ gii b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dii(gii giiVar, Context context, ViewGroup viewGroup) {
        super(context);
        this.b = giiVar;
        this.a = viewGroup;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        int i;
        gii giiVar = this.b;
        ArrayList arrayList = giiVar.b;
        Drawable background = this.a.getBackground();
        if (background instanceof ColorDrawable) {
            i = ((ColorDrawable) background).getColor();
        } else {
            i = 0;
        }
        if (giiVar.e != i) {
            giiVar.e = i;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((ddf) arrayList.get(size)).b(i);
            }
        }
    }
}
