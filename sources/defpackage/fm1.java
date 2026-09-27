package defpackage;

import android.widget.ImageView;
import kotlin.jvm.functions.Function0;
import skip.foundation.URLSessionTask;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final /* synthetic */ class fm1 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ Object c;

    public /* synthetic */ fm1(float f, ImageView imageView) {
        this.a = 0;
        this.b = f;
        this.c = imageView;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        float f = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                ImageView imageView = (ImageView) obj;
                return "Resizing ImageView to aspect ratio " + f + " based on width: " + imageView.getWidth() + " trueWidth: " + imageView.getLayoutParams().width + " height: " + imageView.getLayoutParams().height + " layoutParams: " + imageView.getLayoutParams() + ' ' + imageView;
            case 1:
                return URLSessionTask.h((URLSessionTask) obj, f);
            default:
                return Integer.valueOf((int) ((((Number) ((nwh) obj).getValue()).floatValue() - f) / 3.1499999f));
        }
    }

    public /* synthetic */ fm1(Object obj, float f, int i) {
        this.a = i;
        this.c = obj;
        this.b = f;
    }
}
