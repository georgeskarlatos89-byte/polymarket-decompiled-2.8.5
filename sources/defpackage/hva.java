package defpackage;

import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.os.LocaleList;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class hva extends Paint {
    public final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hva(PorterDuff.Mode mode) {
        super(1);
        this.a = 0;
        setXfermode(new PorterDuffXfermode(mode));
    }

    @Override // android.graphics.Paint
    public void setAlpha(int i) {
        switch (this.a) {
            case 0:
                super.setAlpha(tgc.c(i));
                return;
            default:
                super.setAlpha(i);
                return;
        }
    }

    @Override // android.graphics.Paint
    public void setTextLocales(LocaleList localeList) {
        switch (this.a) {
            case 0:
                return;
            default:
                super.setTextLocales(localeList);
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hva(int i, int i2) {
        super(i);
        this.a = i2;
    }

    public /* synthetic */ hva() {
        this.a = 0;
    }

    private final void a(LocaleList localeList) {
    }
}
