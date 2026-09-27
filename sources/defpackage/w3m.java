package defpackage;

import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public abstract class w3m {
    public static final gri a(mj6 mj6Var) {
        sri sriVar;
        eri eriVar = new eri();
        vom.f(mj6Var, iri.a, new onh(new onh(eriVar, 19), new nyf(1, eriVar, eri.class, "addFilter", "addFilter$foundation(Lkotlin/jvm/functions/Function1;)V", 0, 7)));
        Object obj = null;
        vpc vpcVar = new vpc(0, 1, null);
        vpc vpcVar2 = eriVar.a;
        Object[] objArr = vpcVar2.a;
        int i = vpcVar2.b;
        int i2 = 0;
        boolean z = true;
        fri friVar = null;
        while (true) {
            sriVar = sri.b;
            if (i2 >= i) {
                break;
            }
            fri friVar2 = (fri) objArr[i2];
            if (!z || friVar2 != sriVar) {
                if (friVar2 != sriVar || friVar != sriVar) {
                    if (friVar2 != sriVar) {
                        vpc vpcVar3 = eriVar.b;
                        Object[] objArr2 = vpcVar3.a;
                        int i3 = vpcVar3.b;
                        for (int i4 = 0; i4 < i3; i4++) {
                            if (((Boolean) ((Function1) objArr2[i4]).invoke(friVar2)).booleanValue()) {
                            }
                        }
                    }
                    vpcVar.g(friVar2);
                    z = false;
                    friVar = friVar2;
                }
                z = false;
                break;
            }
            i2++;
        }
        if (!vpcVar.d()) {
            obj = vpcVar.a[vpcVar.b - 1];
        }
        if (((fri) obj) == sriVar) {
            vpcVar.l(vpcVar.b - 1);
        }
        tpc tpcVar = vpcVar.c;
        if (tpcVar == null) {
            tpcVar = new tpc(vpcVar);
            vpcVar.c = tpcVar;
        }
        return new gri(tpcVar);
    }

    public static final kjc b(kjc kjcVar, Function1 function1) {
        return kjcVar.e(new cna(null, function1));
    }

    public static Icon c(IconCompat iconCompat) {
        Icon createWithBitmap;
        String str;
        Uri parse;
        int i = iconCompat.a;
        switch (i) {
            case -1:
                return (Icon) iconCompat.b;
            case 0:
            default:
                dmk.v("Unknown type");
                return null;
            case 1:
                createWithBitmap = Icon.createWithBitmap((Bitmap) iconCompat.b);
                break;
            case 2:
                if (i == -1) {
                    str = ((Icon) iconCompat.b).getResPackage();
                } else if (i == 2) {
                    String str2 = iconCompat.j;
                    if (str2 != null && !TextUtils.isEmpty(str2)) {
                        str = iconCompat.j;
                    } else {
                        str = ((String) iconCompat.b).split(":", -1)[0];
                    }
                } else {
                    fi9.q(iconCompat, "called getResPackage() on ");
                    return null;
                }
                createWithBitmap = Icon.createWithResource(str, iconCompat.e);
                break;
            case 3:
                createWithBitmap = Icon.createWithData((byte[]) iconCompat.b, iconCompat.e, iconCompat.f);
                break;
            case 4:
                createWithBitmap = Icon.createWithContentUri((String) iconCompat.b);
                break;
            case 5:
                createWithBitmap = Icon.createWithAdaptiveBitmap((Bitmap) iconCompat.b);
                break;
            case 6:
                if (i == -1) {
                    parse = ((Icon) iconCompat.b).getUri();
                } else {
                    if (i != 4 && i != 6) {
                        fi9.q(iconCompat, "called getUri() on ");
                        return null;
                    }
                    parse = Uri.parse((String) iconCompat.b);
                }
                createWithBitmap = Icon.createWithAdaptiveBitmapContentUri(parse);
                break;
        }
        ColorStateList colorStateList = iconCompat.g;
        if (colorStateList != null) {
            createWithBitmap.setTintList(colorStateList);
        }
        PorterDuff.Mode mode = iconCompat.h;
        if (mode != IconCompat.k) {
            createWithBitmap.setTintMode(mode);
        }
        return createWithBitmap;
    }
}
