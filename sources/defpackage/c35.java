package defpackage;

import com.braze.ui.contentcards.adapters.ContentCardAdapter;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final /* synthetic */ class c35 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ ContentCardAdapter c;

    public /* synthetic */ c35(int i, int i2, ContentCardAdapter contentCardAdapter) {
        this.a = i2;
        this.b = i;
        this.c = contentCardAdapter;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        ContentCardAdapter contentCardAdapter = this.c;
        int i2 = this.b;
        switch (i) {
            case 0:
                return ContentCardAdapter.b(i2, contentCardAdapter);
            default:
                return ContentCardAdapter.j(i2, contentCardAdapter);
        }
    }
}
