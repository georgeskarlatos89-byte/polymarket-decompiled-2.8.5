package defpackage;

import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class a17 extends CharacterStyle implements UpdateAppearance {
    public final z07 a;

    public a17(z07 z07Var) {
        this.a = z07Var;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        Paint.Join join;
        Paint.Cap cap;
        DashPathEffect dashPathEffect;
        if (textPaint != null) {
            h18 h18Var = h18.a;
            z07 z07Var = this.a;
            if (Intrinsics.areEqual(z07Var, h18Var)) {
                textPaint.setStyle(Paint.Style.FILL);
                return;
            }
            if (z07Var instanceof p9i) {
                textPaint.setStyle(Paint.Style.STROKE);
                p9i p9iVar = (p9i) z07Var;
                textPaint.setStrokeWidth(p9iVar.a);
                textPaint.setStrokeMiter(p9iVar.b);
                int i = p9iVar.d;
                if (i == 0) {
                    join = Paint.Join.MITER;
                } else if (i == 1) {
                    join = Paint.Join.ROUND;
                } else if (i == 2) {
                    join = Paint.Join.BEVEL;
                } else {
                    join = Paint.Join.MITER;
                }
                textPaint.setStrokeJoin(join);
                int i2 = p9iVar.c;
                if (i2 == 0) {
                    cap = Paint.Cap.BUTT;
                } else if (i2 == 1) {
                    cap = Paint.Cap.ROUND;
                } else if (i2 == 2) {
                    cap = Paint.Cap.SQUARE;
                } else {
                    cap = Paint.Cap.BUTT;
                }
                textPaint.setStrokeCap(cap);
                e40 e40Var = p9iVar.e;
                if (e40Var != null) {
                    dashPathEffect = e40Var.a;
                } else {
                    dashPathEffect = null;
                }
                textPaint.setPathEffect(dashPathEffect);
                return;
            }
            dmk.a();
        }
    }
}
