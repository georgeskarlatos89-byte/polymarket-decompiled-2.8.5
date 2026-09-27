package defpackage;

import android.app.Person;
import android.graphics.drawable.Icon;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.core.graphics.drawable.IconCompat;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public abstract class kon {
    public static final void a(final gb0 gb0Var, final kjc kjcVar, final xxi xxiVar, boolean z, int i, int i2, Function1 function1, final Function1 function12, pq4 pq4Var, final int i3) {
        int i4;
        boolean z2;
        sr8 sr8Var;
        final boolean z3;
        final int i5;
        final int i6;
        final Function1 function13;
        boolean z4;
        int i7;
        int i8;
        int i9;
        int i10;
        sr8 sr8Var2 = (sr8) pq4Var;
        sr8Var2.g0(-246609449);
        if ((i3 & 6) == 0) {
            if (sr8Var2.h(gb0Var)) {
                i10 = 4;
            } else {
                i10 = 2;
            }
            i4 = i10 | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            if (sr8Var2.h(kjcVar)) {
                i9 = 32;
            } else {
                i9 = 16;
            }
            i4 |= i9;
        }
        if ((i3 & 384) == 0) {
            if (sr8Var2.h(xxiVar)) {
                i8 = 256;
            } else {
                i8 = 128;
            }
            i4 |= i8;
        }
        int i11 = i4 | 1797120;
        if ((12582912 & i3) == 0) {
            if (sr8Var2.j(function12)) {
                i7 = 8388608;
            } else {
                i7 = 4194304;
            }
            i11 |= i7;
        }
        boolean z5 = true;
        if ((4793491 & i11) != 4793490) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (sr8Var2.V(i11 & 1, z2)) {
            Object Q = sr8Var2.Q();
            uwn uwnVar = oq4.a;
            if (Q == uwnVar) {
                Q = new rx3(9);
                sr8Var2.o0(Q);
            }
            Function1 function14 = (Function1) Q;
            Object Q2 = sr8Var2.Q();
            if (Q2 == uwnVar) {
                Q2 = ikl.c(null);
                sr8Var2.o0(Q2);
            }
            qqc qqcVar = (qqc) Q2;
            if ((29360128 & i11) == 8388608) {
                z4 = true;
            } else {
                z4 = false;
            }
            Object Q3 = sr8Var2.Q();
            if (z4 || Q3 == uwnVar) {
                Q3 = new q54(qqcVar, function12, 0);
                sr8Var2.o0(Q3);
            }
            kjc e = kjcVar.e(cfi.a(hjc.a, function12, (PointerInputEventHandler) Q3));
            if ((i11 & 3670016) != 1048576) {
                z5 = false;
            }
            Object Q4 = sr8Var2.Q();
            if (z5 || Q4 == uwnVar) {
                Q4 = new o54(qqcVar, function14, 0);
                sr8Var2.o0(Q4);
            }
            sr8Var = sr8Var2;
            ugn.a(gb0Var, e, xxiVar, (Function1) Q4, 1, true, bd0.API_PRIORITY_OTHER, 0, null, null, sr8Var, (58254 & i11) | (458752 & (i11 << 6)) | ((i11 << 3) & 3670016), 0, 1920);
            function13 = function14;
            i5 = 1;
            z3 = true;
            i6 = Integer.MAX_VALUE;
        } else {
            sr8Var = sr8Var2;
            sr8Var.Y();
            z3 = z;
            i5 = i;
            i6 = i2;
            function13 = function1;
        }
        nrf u = sr8Var.u();
        if (u != null) {
            u.d = new Function2() { // from class: p54
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    kon.a(gb0.this, kjcVar, xxiVar, z3, i5, i6, function13, function12, (pq4) obj, rtn.a(i3 | 1));
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static Person b(ble bleVar) {
        Icon icon;
        Person.Builder name = new Person.Builder().setName(bleVar.a);
        IconCompat iconCompat = bleVar.b;
        if (iconCompat != null) {
            icon = w3m.c(iconCompat);
        } else {
            icon = null;
        }
        return name.setIcon(icon).setUri(bleVar.c).setKey(bleVar.d).setBot(bleVar.e).setImportant(bleVar.f).build();
    }
}
