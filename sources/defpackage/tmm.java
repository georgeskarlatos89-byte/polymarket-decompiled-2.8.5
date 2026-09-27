package defpackage;

import android.os.Bundle;
import java.util.EnumMap;
import java.util.Iterator;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class tmm {
    public static final tmm c = new tmm(100);
    public final EnumMap a;
    public final int b;

    public tmm(int i) {
        EnumMap enumMap = new EnumMap(omm.class);
        this.a = enumMap;
        omm ommVar = omm.AD_STORAGE;
        cmm cmmVar = cmm.UNINITIALIZED;
        enumMap.put((EnumMap) ommVar, (omm) cmmVar);
        enumMap.put((EnumMap) omm.ANALYTICS_STORAGE, (omm) cmmVar);
        this.b = i;
    }

    public static String a(int i) {
        if (i != -30) {
            if (i != -20) {
                if (i != -10) {
                    if (i != 0) {
                        if (i != 30) {
                            if (i != 90) {
                                if (i != 100) {
                                    return "OTHER";
                                }
                                return "UNKNOWN";
                            }
                            return "REMOTE_CONFIG";
                        }
                        return "1P_INIT";
                    }
                    return "1P_API";
                }
                return "MANIFEST";
            }
            return "API";
        }
        return "TCF";
    }

    public static tmm b(int i, Bundle bundle) {
        if (bundle == null) {
            return new tmm(i);
        }
        EnumMap enumMap = new EnumMap(omm.class);
        for (omm ommVar : imm.STORAGE.b()) {
            enumMap.put((EnumMap) ommVar, (omm) d(bundle.getString(ommVar.zze)));
        }
        return new tmm(enumMap, i);
    }

    public static tmm c(int i, String str) {
        String str2;
        EnumMap enumMap = new EnumMap(omm.class);
        omm[] a = imm.STORAGE.a();
        for (int i2 = 0; i2 < a.length; i2++) {
            if (str == null) {
                str2 = "";
            } else {
                str2 = str;
            }
            omm ommVar = a[i2];
            int i3 = i2 + 2;
            if (i3 < str2.length()) {
                enumMap.put((EnumMap) ommVar, (omm) e(str2.charAt(i3)));
            } else {
                enumMap.put((EnumMap) ommVar, (omm) cmm.UNINITIALIZED);
            }
        }
        return new tmm(enumMap, i);
    }

    public static cmm d(String str) {
        if (str == null) {
            return cmm.UNINITIALIZED;
        }
        if (str.equals("granted")) {
            return cmm.GRANTED;
        }
        if (str.equals("denied")) {
            return cmm.DENIED;
        }
        return cmm.UNINITIALIZED;
    }

    public static cmm e(char c2) {
        if (c2 != '+') {
            if (c2 != '0') {
                if (c2 != '1') {
                    return cmm.UNINITIALIZED;
                }
                return cmm.GRANTED;
            }
            return cmm.DENIED;
        }
        return cmm.POLICY;
    }

    public static char h(cmm cmmVar) {
        if (cmmVar != null) {
            int ordinal = cmmVar.ordinal();
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal == 3) {
                        return '1';
                    }
                    return '-';
                }
                return '0';
            }
            return '+';
        }
        return '-';
    }

    public static boolean l(int i, int i2) {
        int i3 = -30;
        if (i == -20) {
            if (i2 != -30) {
                i = -20;
            } else {
                return true;
            }
        }
        if (i == -30) {
            if (i2 == -20) {
                return true;
            }
        } else {
            i3 = i;
        }
        if (i3 != i2 && i >= i2) {
            return false;
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof tmm) {
            tmm tmmVar = (tmm) obj;
            omm[] b = imm.STORAGE.b();
            int length = b.length;
            int i = 0;
            while (true) {
                if (i < length) {
                    omm ommVar = b[i];
                    if (this.a.get(ommVar) != tmmVar.a.get(ommVar)) {
                        break;
                    }
                    i++;
                } else if (this.b == tmmVar.b) {
                    return true;
                }
            }
        }
        return false;
    }

    public final String f() {
        int ordinal;
        StringBuilder sb = new StringBuilder("G1");
        for (omm ommVar : imm.STORAGE.a()) {
            cmm cmmVar = (cmm) this.a.get(ommVar);
            char c2 = '-';
            if (cmmVar != null && (ordinal = cmmVar.ordinal()) != 0) {
                if (ordinal != 1) {
                    if (ordinal != 2) {
                        if (ordinal != 3) {
                        }
                    } else {
                        c2 = '0';
                    }
                }
                c2 = '1';
            }
            sb.append(c2);
        }
        return sb.toString();
    }

    public final String g() {
        StringBuilder sb = new StringBuilder("G1");
        for (omm ommVar : imm.STORAGE.a()) {
            sb.append(h((cmm) this.a.get(ommVar)));
        }
        return sb.toString();
    }

    public final int hashCode() {
        Iterator it = this.a.values().iterator();
        int i = this.b * 17;
        while (it.hasNext()) {
            i = (i * 31) + ((cmm) it.next()).hashCode();
        }
        return i;
    }

    public final boolean i(omm ommVar) {
        if (((cmm) this.a.get(ommVar)) == cmm.DENIED) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0047 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final tmm j(tmm tmmVar) {
        EnumMap enumMap = new EnumMap(omm.class);
        for (omm ommVar : imm.STORAGE.b()) {
            cmm cmmVar = (cmm) this.a.get(ommVar);
            cmm cmmVar2 = (cmm) tmmVar.a.get(ommVar);
            if (cmmVar != null) {
                if (cmmVar2 != null) {
                    cmm cmmVar3 = cmm.UNINITIALIZED;
                    if (cmmVar != cmmVar3) {
                        if (cmmVar2 != cmmVar3) {
                            cmm cmmVar4 = cmm.POLICY;
                            if (cmmVar != cmmVar4) {
                                if (cmmVar2 != cmmVar4) {
                                    cmm cmmVar5 = cmm.DENIED;
                                    cmmVar = (cmmVar == cmmVar5 || cmmVar2 == cmmVar5) ? cmmVar5 : cmm.GRANTED;
                                }
                            }
                        }
                    }
                }
                if (cmmVar == null) {
                    enumMap.put((EnumMap) ommVar, (omm) cmmVar);
                }
            }
            cmmVar = cmmVar2;
            if (cmmVar == null) {
            }
        }
        return new tmm(enumMap, 100);
    }

    public final tmm k(tmm tmmVar) {
        EnumMap enumMap = new EnumMap(omm.class);
        for (omm ommVar : imm.STORAGE.b()) {
            cmm cmmVar = (cmm) this.a.get(ommVar);
            if (cmmVar == cmm.UNINITIALIZED) {
                cmmVar = (cmm) tmmVar.a.get(ommVar);
            }
            if (cmmVar != null) {
                enumMap.put((EnumMap) ommVar, (omm) cmmVar);
            }
        }
        return new tmm(enumMap, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("source=");
        sb.append(a(this.b));
        for (omm ommVar : imm.STORAGE.b()) {
            sb.append(",");
            sb.append(ommVar.zze);
            sb.append("=");
            cmm cmmVar = (cmm) this.a.get(ommVar);
            if (cmmVar == null) {
                cmmVar = cmm.UNINITIALIZED;
            }
            sb.append(cmmVar);
        }
        return sb.toString();
    }

    public tmm(EnumMap enumMap, int i) {
        EnumMap enumMap2 = new EnumMap(omm.class);
        this.a = enumMap2;
        enumMap2.putAll(enumMap);
        this.b = i;
    }
}
