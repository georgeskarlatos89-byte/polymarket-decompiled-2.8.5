package defpackage;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Parcel;
import android.text.Annotation;
import android.text.SpannableString;
import android.util.Base64;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class zz implements y64 {
    public final Context a;
    public ClipboardManager b;

    public zz(Context context) {
        this.a = context;
    }

    public final ClipboardManager a() {
        ClipboardManager clipboardManager = this.b;
        if (clipboardManager == null) {
            Object systemService = this.a.getSystemService("clipboard");
            systemService.getClass();
            ClipboardManager clipboardManager2 = (ClipboardManager) systemService;
            this.b = clipboardManager2;
            return clipboardManager2;
        }
        return clipboardManager;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [fx5, java.lang.Object] */
    public final void b(gb0 gb0Var) {
        SpannableString spannableString;
        byte b;
        ClipboardManager a = a();
        List list = gb0Var.c;
        if (list == null) {
            list = CollectionsKt.emptyList();
        }
        CharSequence charSequence = gb0Var.b;
        if (!list.isEmpty()) {
            SpannableString spannableString2 = new SpannableString(charSequence);
            ?? obj = new Object();
            obj.a = Parcel.obtain();
            List list2 = gb0Var.c;
            if (list2 == null) {
                list2 = CollectionsKt.emptyList();
            }
            int size = list2.size();
            int i = 0;
            SpannableString spannableString3 = spannableString2;
            while (i < size) {
                fb0 fb0Var = (fb0) list2.get(i);
                vfh vfhVar = (vfh) fb0Var.a;
                int i2 = fb0Var.b;
                int i3 = fb0Var.c;
                obj.a.recycle();
                obj.a = Parcel.obtain();
                pvi pviVar = vfhVar.a;
                long j = vfhVar.l;
                long j2 = vfhVar.h;
                int i4 = i;
                long j3 = vfhVar.b;
                List list3 = list2;
                ClipboardManager clipboardManager = a;
                long a2 = pviVar.a();
                long j4 = ib4.m;
                if (!hkj.a(a2, j4)) {
                    obj.c((byte) 1);
                    spannableString = spannableString3;
                    obj.f(vfhVar.a.a());
                } else {
                    spannableString = spannableString3;
                }
                long j5 = cyi.c;
                byte b2 = 2;
                if (!cyi.a(j3, j5)) {
                    obj.c((byte) 2);
                    obj.e(j3);
                }
                qi8 qi8Var = vfhVar.c;
                if (qi8Var != null) {
                    obj.c((byte) 3);
                    obj.a.writeInt(qi8Var.a);
                }
                li8 li8Var = vfhVar.d;
                if (li8Var != null) {
                    int i5 = li8Var.a;
                    obj.c((byte) 4);
                    if (i5 == 0 || i5 != 1) {
                        b = 0;
                    } else {
                        b = 1;
                    }
                    obj.c(b);
                }
                mi8 mi8Var = vfhVar.e;
                if (mi8Var != null) {
                    int i6 = mi8Var.a;
                    obj.c((byte) 5);
                    if (i6 != 0) {
                        if (i6 == 65535) {
                            b2 = 1;
                        } else if (i6 != 1) {
                            if (i6 == 2) {
                                b2 = 3;
                            }
                        }
                        obj.c(b2);
                    }
                    b2 = 0;
                    obj.c(b2);
                }
                String str = vfhVar.g;
                if (str != null) {
                    obj.c((byte) 6);
                    obj.a.writeString(str);
                }
                if (!cyi.a(j2, j5)) {
                    obj.c((byte) 7);
                    obj.e(j2);
                }
                ab1 ab1Var = vfhVar.i;
                if (ab1Var != null) {
                    float f = ab1Var.a;
                    obj.c((byte) 8);
                    obj.d(f);
                }
                qvi qviVar = vfhVar.j;
                if (qviVar != null) {
                    obj.c((byte) 9);
                    obj.d(qviVar.a);
                    obj.d(qviVar.b);
                }
                if (!hkj.a(j, j4)) {
                    obj.c((byte) 10);
                    obj.f(j);
                }
                xri xriVar = vfhVar.m;
                if (xriVar != null) {
                    obj.c((byte) 11);
                    obj.a.writeInt(xriVar.a);
                }
                t0h t0hVar = vfhVar.n;
                if (t0hVar != null) {
                    obj.c((byte) 12);
                    obj.f(t0hVar.a);
                    long j6 = t0hVar.b;
                    obj.d(Float.intBitsToFloat((int) (j6 >> 32)));
                    obj.d(Float.intBitsToFloat((int) (j6 & 4294967295L)));
                    obj.d(t0hVar.c);
                }
                SpannableString spannableString4 = spannableString;
                spannableString4.setSpan(new Annotation("androidx.compose.text.SpanStyle", Base64.encodeToString(obj.a.marshall(), 0)), i2, i3, 33);
                i = i4 + 1;
                spannableString3 = spannableString4;
                a = clipboardManager;
                list2 = list3;
            }
            charSequence = spannableString3;
        }
        a.setPrimaryClip(ClipData.newPlainText("plain text", charSequence));
    }
}
