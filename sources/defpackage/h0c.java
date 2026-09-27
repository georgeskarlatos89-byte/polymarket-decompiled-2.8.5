package defpackage;

import com.google.mlkit.common.MlKitException;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class h0c {
    public final bm9 a;

    public h0c(knk knkVar, knk knkVar2, i2f i2fVar) {
        this.a = new bm9(knkVar, knkVar2, i2fVar, 6);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:14:0x0116. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0028. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:12:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01fc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int a(bm9 bm9Var, Object obj, Object obj2) {
        int j;
        int a;
        int i;
        knk knkVar;
        int a2;
        int i2;
        knk knkVar2 = (knk) bm9Var.b;
        int i3 = az7.c;
        int i4 = 1;
        int h = e94.h(1);
        knk knkVar3 = knk.GROUP;
        if (knkVar2 == knkVar3) {
            h *= 2;
        }
        int[] iArr = yy7.b;
        switch (iArr[knkVar2.ordinal()]) {
            case 1:
                ((Double) obj).getClass();
                j = 8;
                int i5 = j + h;
                knkVar = (knk) bm9Var.c;
                int h2 = e94.h(2);
                if (knkVar == knkVar3) {
                    h2 *= 2;
                }
                switch (iArr[knkVar.ordinal()]) {
                    case 1:
                        ((Double) obj2).getClass();
                        i4 = 8;
                        return i4 + h2 + i5;
                    case 2:
                        ((Float) obj2).getClass();
                        i4 = 4;
                        return i4 + h2 + i5;
                    case 3:
                        i4 = e94.j(((Long) obj2).longValue());
                        return i4 + h2 + i5;
                    case 4:
                        i4 = e94.j(((Long) obj2).longValue());
                        return i4 + h2 + i5;
                    case 5:
                        i4 = e94.j(((Integer) obj2).intValue());
                        return i4 + h2 + i5;
                    case 6:
                        ((Long) obj2).getClass();
                        i4 = 8;
                        return i4 + h2 + i5;
                    case 7:
                        ((Integer) obj2).getClass();
                        i4 = 4;
                        return i4 + h2 + i5;
                    case 8:
                        ((Boolean) obj2).getClass();
                        return i4 + h2 + i5;
                    case 9:
                        i4 = ((ts8) ((i4) obj2)).a(null);
                        return i4 + h2 + i5;
                    case 10:
                        a2 = ((ts8) ((i4) obj2)).a(null);
                        i2 = e94.i(a2);
                        i4 = i2 + a2;
                        return i4 + h2 + i5;
                    case 11:
                        if (obj2 instanceof dw1) {
                            a2 = ((dw1) obj2).size();
                            i2 = e94.i(a2);
                            i4 = i2 + a2;
                            return i4 + h2 + i5;
                        }
                        i4 = e94.g((String) obj2);
                        return i4 + h2 + i5;
                    case 12:
                        if (obj2 instanceof dw1) {
                            a2 = ((dw1) obj2).size();
                            i2 = e94.i(a2);
                        } else {
                            a2 = ((byte[]) obj2).length;
                            i2 = e94.i(a2);
                        }
                        i4 = i2 + a2;
                        return i4 + h2 + i5;
                    case 13:
                        i4 = e94.i(((Integer) obj2).intValue());
                        return i4 + h2 + i5;
                    case 14:
                        ((Integer) obj2).getClass();
                        i4 = 4;
                        return i4 + h2 + i5;
                    case 15:
                        ((Long) obj2).getClass();
                        i4 = 8;
                        return i4 + h2 + i5;
                    case 16:
                        int intValue = ((Integer) obj2).intValue();
                        i4 = e94.i((intValue >> 31) ^ (intValue << 1));
                        return i4 + h2 + i5;
                    case 17:
                        long longValue = ((Long) obj2).longValue();
                        i4 = e94.j((longValue >> 63) ^ (longValue << 1));
                        return i4 + h2 + i5;
                    case MlKitException.UNSUPPORTED /* 18 */:
                        i4 = e94.j(((Integer) obj2).intValue());
                        return i4 + h2 + i5;
                    default:
                        qp7.p("There is no way to get here, but the compiler thinks otherwise.");
                        return 0;
                }
            case 2:
                ((Float) obj).getClass();
                j = 4;
                int i52 = j + h;
                knkVar = (knk) bm9Var.c;
                int h22 = e94.h(2);
                if (knkVar == knkVar3) {
                }
                switch (iArr[knkVar.ordinal()]) {
                }
            case 3:
                j = e94.j(((Long) obj).longValue());
                int i522 = j + h;
                knkVar = (knk) bm9Var.c;
                int h222 = e94.h(2);
                if (knkVar == knkVar3) {
                }
                switch (iArr[knkVar.ordinal()]) {
                }
            case 4:
                j = e94.j(((Long) obj).longValue());
                int i5222 = j + h;
                knkVar = (knk) bm9Var.c;
                int h2222 = e94.h(2);
                if (knkVar == knkVar3) {
                }
                switch (iArr[knkVar.ordinal()]) {
                }
            case 5:
                j = e94.j(((Integer) obj).intValue());
                int i52222 = j + h;
                knkVar = (knk) bm9Var.c;
                int h22222 = e94.h(2);
                if (knkVar == knkVar3) {
                }
                switch (iArr[knkVar.ordinal()]) {
                }
            case 6:
                ((Long) obj).getClass();
                j = 8;
                int i522222 = j + h;
                knkVar = (knk) bm9Var.c;
                int h222222 = e94.h(2);
                if (knkVar == knkVar3) {
                }
                switch (iArr[knkVar.ordinal()]) {
                }
            case 7:
                ((Integer) obj).getClass();
                j = 4;
                int i5222222 = j + h;
                knkVar = (knk) bm9Var.c;
                int h2222222 = e94.h(2);
                if (knkVar == knkVar3) {
                }
                switch (iArr[knkVar.ordinal()]) {
                }
            case 8:
                ((Boolean) obj).getClass();
                j = 1;
                int i52222222 = j + h;
                knkVar = (knk) bm9Var.c;
                int h22222222 = e94.h(2);
                if (knkVar == knkVar3) {
                }
                switch (iArr[knkVar.ordinal()]) {
                }
            case 9:
                j = ((ts8) ((i4) obj)).a(null);
                int i522222222 = j + h;
                knkVar = (knk) bm9Var.c;
                int h222222222 = e94.h(2);
                if (knkVar == knkVar3) {
                }
                switch (iArr[knkVar.ordinal()]) {
                }
            case 10:
                a = ((ts8) ((i4) obj)).a(null);
                i = e94.i(a);
                j = a + i;
                int i5222222222 = j + h;
                knkVar = (knk) bm9Var.c;
                int h2222222222 = e94.h(2);
                if (knkVar == knkVar3) {
                }
                switch (iArr[knkVar.ordinal()]) {
                }
            case 11:
                if (obj instanceof dw1) {
                    a = ((dw1) obj).size();
                    i = e94.i(a);
                    j = a + i;
                    int i52222222222 = j + h;
                    knkVar = (knk) bm9Var.c;
                    int h22222222222 = e94.h(2);
                    if (knkVar == knkVar3) {
                    }
                    switch (iArr[knkVar.ordinal()]) {
                    }
                } else {
                    j = e94.g((String) obj);
                    int i522222222222 = j + h;
                    knkVar = (knk) bm9Var.c;
                    int h222222222222 = e94.h(2);
                    if (knkVar == knkVar3) {
                    }
                    switch (iArr[knkVar.ordinal()]) {
                    }
                }
            case 12:
                if (obj instanceof dw1) {
                    a = ((dw1) obj).size();
                    i = e94.i(a);
                } else {
                    a = ((byte[]) obj).length;
                    i = e94.i(a);
                }
                j = a + i;
                int i5222222222222 = j + h;
                knkVar = (knk) bm9Var.c;
                int h2222222222222 = e94.h(2);
                if (knkVar == knkVar3) {
                }
                switch (iArr[knkVar.ordinal()]) {
                }
            case 13:
                j = e94.i(((Integer) obj).intValue());
                int i52222222222222 = j + h;
                knkVar = (knk) bm9Var.c;
                int h22222222222222 = e94.h(2);
                if (knkVar == knkVar3) {
                }
                switch (iArr[knkVar.ordinal()]) {
                }
            case 14:
                ((Integer) obj).getClass();
                j = 4;
                int i522222222222222 = j + h;
                knkVar = (knk) bm9Var.c;
                int h222222222222222 = e94.h(2);
                if (knkVar == knkVar3) {
                }
                switch (iArr[knkVar.ordinal()]) {
                }
            case 15:
                ((Long) obj).getClass();
                j = 8;
                int i5222222222222222 = j + h;
                knkVar = (knk) bm9Var.c;
                int h2222222222222222 = e94.h(2);
                if (knkVar == knkVar3) {
                }
                switch (iArr[knkVar.ordinal()]) {
                }
            case 16:
                int intValue2 = ((Integer) obj).intValue();
                j = e94.i((intValue2 >> 31) ^ (intValue2 << 1));
                int i52222222222222222 = j + h;
                knkVar = (knk) bm9Var.c;
                int h22222222222222222 = e94.h(2);
                if (knkVar == knkVar3) {
                }
                switch (iArr[knkVar.ordinal()]) {
                }
            case 17:
                long longValue2 = ((Long) obj).longValue();
                j = e94.j((longValue2 << 1) ^ (longValue2 >> 63));
                int i522222222222222222 = j + h;
                knkVar = (knk) bm9Var.c;
                int h222222222222222222 = e94.h(2);
                if (knkVar == knkVar3) {
                }
                switch (iArr[knkVar.ordinal()]) {
                }
            case MlKitException.UNSUPPORTED /* 18 */:
                j = e94.j(((Integer) obj).intValue());
                int i5222222222222222222 = j + h;
                knkVar = (knk) bm9Var.c;
                int h2222222222222222222 = e94.h(2);
                if (knkVar == knkVar3) {
                }
                switch (iArr[knkVar.ordinal()]) {
                }
            default:
                qp7.p("There is no way to get here, but the compiler thinks otherwise.");
                return 0;
        }
    }
}
