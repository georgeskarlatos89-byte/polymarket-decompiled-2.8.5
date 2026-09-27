package defpackage;

import android.os.Bundle;
import java.util.EnumMap;
import java.util.Objects;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class nfl {
    public static final nfl f = new nfl((Boolean) null, 100, (Boolean) null, (String) null);
    public final int a;
    public final String b;
    public final Boolean c;
    public final String d;
    public final EnumMap e;

    public nfl(Boolean bool, int i, Boolean bool2, String str) {
        cmm cmmVar;
        EnumMap enumMap = new EnumMap(omm.class);
        this.e = enumMap;
        omm ommVar = omm.AD_USER_DATA;
        if (bool == null) {
            cmmVar = cmm.UNINITIALIZED;
        } else if (bool.booleanValue()) {
            cmmVar = cmm.GRANTED;
        } else {
            cmmVar = cmm.DENIED;
        }
        enumMap.put((EnumMap) ommVar, (omm) cmmVar);
        this.a = i;
        this.b = e();
        this.c = bool2;
        this.d = str;
    }

    public static nfl b(String str) {
        if (str != null && str.length() > 0) {
            String[] split = str.split(":");
            int parseInt = Integer.parseInt(split[0]);
            EnumMap enumMap = new EnumMap(omm.class);
            omm[] a = imm.DMA.a();
            int length = a.length;
            int i = 1;
            int i2 = 0;
            while (i2 < length) {
                enumMap.put((EnumMap) a[i2], (omm) tmm.e(split[i].charAt(0)));
                i2++;
                i++;
            }
            return new nfl(enumMap, parseInt, (Boolean) null, (String) null);
        }
        return f;
    }

    public static nfl c(int i, Bundle bundle) {
        Boolean bool = null;
        if (bundle == null) {
            return new nfl((Boolean) null, i, (Boolean) null, (String) null);
        }
        EnumMap enumMap = new EnumMap(omm.class);
        for (omm ommVar : imm.DMA.a()) {
            enumMap.put((EnumMap) ommVar, (omm) tmm.d(bundle.getString(ommVar.zze)));
        }
        if (bundle.containsKey("is_dma_region")) {
            bool = Boolean.valueOf(bundle.getString("is_dma_region"));
        }
        return new nfl(enumMap, i, bool, bundle.getString("cps_display_str"));
    }

    public static Boolean d(Bundle bundle) {
        cmm d;
        if (bundle != null && (d = tmm.d(bundle.getString("ad_personalization"))) != null) {
            int ordinal = d.ordinal();
            if (ordinal != 2) {
                if (ordinal == 3) {
                    return Boolean.TRUE;
                }
                return null;
            }
            return Boolean.FALSE;
        }
        return null;
    }

    public final cmm a() {
        cmm cmmVar = (cmm) this.e.get(omm.AD_USER_DATA);
        if (cmmVar == null) {
            return cmm.UNINITIALIZED;
        }
        return cmmVar;
    }

    public final String e() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        for (omm ommVar : imm.DMA.a()) {
            sb.append(":");
            sb.append(tmm.h((cmm) this.e.get(ommVar)));
        }
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof nfl) {
            nfl nflVar = (nfl) obj;
            if (this.b.equalsIgnoreCase(nflVar.b) && Objects.equals(this.c, nflVar.c)) {
                return Objects.equals(this.d, nflVar.d);
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode;
        Boolean bool = this.c;
        if (bool == null) {
            i = 3;
        } else if (true != bool.booleanValue()) {
            i = 13;
        } else {
            i = 7;
        }
        String str = this.d;
        if (str == null) {
            hashCode = 17;
        } else {
            hashCode = str.hashCode();
        }
        return (hashCode * 137) + this.b.hashCode() + (i * 29);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("source=");
        sb.append(tmm.a(this.a));
        for (omm ommVar : imm.DMA.a()) {
            sb.append(",");
            sb.append(ommVar.zze);
            sb.append("=");
            cmm cmmVar = (cmm) this.e.get(ommVar);
            if (cmmVar == null) {
                sb.append("uninitialized");
            } else {
                int ordinal = cmmVar.ordinal();
                if (ordinal != 0) {
                    if (ordinal != 1) {
                        if (ordinal != 2) {
                            if (ordinal == 3) {
                                sb.append("granted");
                            }
                        } else {
                            sb.append("denied");
                        }
                    } else {
                        sb.append("eu_consent_policy");
                    }
                } else {
                    sb.append("uninitialized");
                }
            }
        }
        Boolean bool = this.c;
        if (bool != null) {
            sb.append(",isDmaRegion=");
            sb.append(bool);
        }
        String str = this.d;
        if (str != null) {
            sb.append(",cpsDisplayStr=");
            sb.append(str);
        }
        return sb.toString();
    }

    public nfl(EnumMap enumMap, int i, Boolean bool, String str) {
        EnumMap enumMap2 = new EnumMap(omm.class);
        this.e = enumMap2;
        enumMap2.putAll(enumMap);
        this.a = i;
        this.b = e();
        this.c = bool;
        this.d = str;
    }
}
