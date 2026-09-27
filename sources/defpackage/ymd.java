package defpackage;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.e;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class ymd extends gb7 {
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ymd(e eVar, int i) {
        super(eVar);
        this.d = i;
    }

    @Override // defpackage.gb7
    public final int b(View view) {
        int D;
        int i;
        int i2 = this.d;
        Object obj = this.b;
        switch (i2) {
            case 0:
                tsf tsfVar = (tsf) view.getLayoutParams();
                ((e) obj).getClass();
                D = e.D(view);
                i = ((ViewGroup.MarginLayoutParams) tsfVar).rightMargin;
                break;
            default:
                tsf tsfVar2 = (tsf) view.getLayoutParams();
                ((e) obj).getClass();
                D = e.y(view);
                i = ((ViewGroup.MarginLayoutParams) tsfVar2).bottomMargin;
                break;
        }
        return D + i;
    }

    @Override // defpackage.gb7
    public final int c(View view) {
        int C;
        int i;
        int i2 = this.d;
        Object obj = this.b;
        switch (i2) {
            case 0:
                tsf tsfVar = (tsf) view.getLayoutParams();
                ((e) obj).getClass();
                C = e.C(view) + ((ViewGroup.MarginLayoutParams) tsfVar).leftMargin;
                i = ((ViewGroup.MarginLayoutParams) tsfVar).rightMargin;
                break;
            default:
                tsf tsfVar2 = (tsf) view.getLayoutParams();
                ((e) obj).getClass();
                C = e.B(view) + ((ViewGroup.MarginLayoutParams) tsfVar2).topMargin;
                i = ((ViewGroup.MarginLayoutParams) tsfVar2).bottomMargin;
                break;
        }
        return C + i;
    }

    @Override // defpackage.gb7
    public final int d(View view) {
        int B;
        int i;
        int i2 = this.d;
        Object obj = this.b;
        switch (i2) {
            case 0:
                tsf tsfVar = (tsf) view.getLayoutParams();
                ((e) obj).getClass();
                B = e.B(view) + ((ViewGroup.MarginLayoutParams) tsfVar).topMargin;
                i = ((ViewGroup.MarginLayoutParams) tsfVar).bottomMargin;
                break;
            default:
                tsf tsfVar2 = (tsf) view.getLayoutParams();
                ((e) obj).getClass();
                B = e.C(view) + ((ViewGroup.MarginLayoutParams) tsfVar2).leftMargin;
                i = ((ViewGroup.MarginLayoutParams) tsfVar2).rightMargin;
                break;
        }
        return B + i;
    }

    @Override // defpackage.gb7
    public final int e(View view) {
        int A;
        int i;
        int i2 = this.d;
        Object obj = this.b;
        switch (i2) {
            case 0:
                tsf tsfVar = (tsf) view.getLayoutParams();
                ((e) obj).getClass();
                A = e.A(view);
                i = ((ViewGroup.MarginLayoutParams) tsfVar).leftMargin;
                break;
            default:
                tsf tsfVar2 = (tsf) view.getLayoutParams();
                ((e) obj).getClass();
                A = e.E(view);
                i = ((ViewGroup.MarginLayoutParams) tsfVar2).topMargin;
                break;
        }
        return A - i;
    }

    @Override // defpackage.gb7
    public final int f() {
        switch (this.d) {
            case 0:
                return ((e) this.b).n;
            default:
                return ((e) this.b).o;
        }
    }

    @Override // defpackage.gb7
    public final int g() {
        int i;
        int I;
        int i2 = this.d;
        Object obj = this.b;
        switch (i2) {
            case 0:
                e eVar = (e) obj;
                i = eVar.n;
                I = eVar.I();
                break;
            default:
                e eVar2 = (e) obj;
                i = eVar2.o;
                I = eVar2.G();
                break;
        }
        return i - I;
    }

    @Override // defpackage.gb7
    public final int h() {
        switch (this.d) {
            case 0:
                return ((e) this.b).I();
            default:
                return ((e) this.b).G();
        }
    }

    @Override // defpackage.gb7
    public final int i() {
        switch (this.d) {
            case 0:
                return ((e) this.b).l;
            default:
                return ((e) this.b).m;
        }
    }

    @Override // defpackage.gb7
    public final int j() {
        switch (this.d) {
            case 0:
                return ((e) this.b).m;
            default:
                return ((e) this.b).l;
        }
    }

    @Override // defpackage.gb7
    public final int k() {
        switch (this.d) {
            case 0:
                return ((e) this.b).H();
            default:
                return ((e) this.b).J();
        }
    }

    @Override // defpackage.gb7
    public final int l() {
        int H;
        int I;
        int i = this.d;
        Object obj = this.b;
        switch (i) {
            case 0:
                e eVar = (e) obj;
                H = eVar.n - eVar.H();
                I = eVar.I();
                break;
            default:
                e eVar2 = (e) obj;
                H = eVar2.o - eVar2.J();
                I = eVar2.G();
                break;
        }
        return H - I;
    }

    @Override // defpackage.gb7
    public final int m(View view) {
        int i = this.d;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                Rect rect = (Rect) obj;
                ((e) obj2).N(rect, view);
                return rect.right;
            default:
                Rect rect2 = (Rect) obj;
                ((e) obj2).N(rect2, view);
                return rect2.bottom;
        }
    }

    @Override // defpackage.gb7
    public final int n(View view) {
        int i = this.d;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                Rect rect = (Rect) obj;
                ((e) obj2).N(rect, view);
                return rect.left;
            default:
                Rect rect2 = (Rect) obj;
                ((e) obj2).N(rect2, view);
                return rect2.top;
        }
    }

    @Override // defpackage.gb7
    public final void o(int i) {
        switch (this.d) {
            case 0:
                ((e) this.b).S(i);
                return;
            default:
                ((e) this.b).T(i);
                return;
        }
    }
}
