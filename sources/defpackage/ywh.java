package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.StateSet;
import com.polymarket.android.R;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class ywh {
    public int a;
    public x75 b;
    public int[][] c = new int[10];
    public x75[] d = new x75[10];

    public static ywh b(x75 x75Var) {
        ywh ywhVar = new ywh();
        ywhVar.a(StateSet.WILD_CARD, x75Var);
        return ywhVar;
    }

    public final void a(int[] iArr, x75 x75Var) {
        int i = this.a;
        if (i == 0 || iArr.length == 0) {
            this.b = x75Var;
        }
        int[][] iArr2 = this.c;
        if (i >= iArr2.length) {
            int i2 = i + 10;
            int[][] iArr3 = new int[i2];
            System.arraycopy(iArr2, 0, iArr3, 0, i);
            this.c = iArr3;
            x75[] x75VarArr = new x75[i2];
            System.arraycopy(this.d, 0, x75VarArr, 0, i);
            this.d = x75VarArr;
        }
        int[][] iArr4 = this.c;
        int i3 = this.a;
        iArr4[i3] = iArr;
        this.d[i3] = x75Var;
        this.a = i3 + 1;
    }

    public final x75 c(int[] iArr) {
        int i;
        int[][] iArr2 = this.c;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            i = -1;
            if (i3 < this.a) {
                if (StateSet.stateSetMatches(iArr2[i3], iArr)) {
                    break;
                }
                i3++;
            } else {
                i3 = -1;
                break;
            }
        }
        if (i3 < 0) {
            int[] iArr3 = StateSet.WILD_CARD;
            int[][] iArr4 = this.c;
            while (true) {
                if (i2 >= this.a) {
                    break;
                }
                if (StateSet.stateSetMatches(iArr4[i2], iArr3)) {
                    i = i2;
                    break;
                }
                i2++;
            }
            i3 = i;
        }
        if (i3 < 0) {
            return this.b;
        }
        return this.d[i3];
    }

    public final void d(Context context, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Resources.Theme theme) {
        TypedArray obtainStyledAttributes;
        int depth = xmlResourceParser.getDepth() + 1;
        while (true) {
            int next = xmlResourceParser.next();
            if (next != 1) {
                int depth2 = xmlResourceParser.getDepth();
                if (depth2 >= depth || next != 3) {
                    if (next == 2 && depth2 <= depth && xmlResourceParser.getName().equals("item")) {
                        Resources resources = context.getResources();
                        int[] iArr = jlf.I;
                        if (theme == null) {
                            obtainStyledAttributes = resources.obtainAttributes(attributeSet, iArr);
                        } else {
                            obtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
                        }
                        x75 j = b1h.j(obtainStyledAttributes, 5, new n0(0.0f));
                        obtainStyledAttributes.recycle();
                        int attributeCount = attributeSet.getAttributeCount();
                        int[] iArr2 = new int[attributeCount];
                        int i = 0;
                        for (int i2 = 0; i2 < attributeCount; i2++) {
                            int attributeNameResource = attributeSet.getAttributeNameResource(i2);
                            if (attributeNameResource != R.attr.cornerSize) {
                                int i3 = i + 1;
                                if (!attributeSet.getAttributeBooleanValue(i2, false)) {
                                    attributeNameResource = -attributeNameResource;
                                }
                                iArr2[i] = attributeNameResource;
                                i = i3;
                            }
                        }
                        a(StateSet.trimStateSet(iArr2, i), j);
                    }
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }
}
