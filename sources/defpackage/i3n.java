package defpackage;

import io.radar.sdk.RadarTripOptions;
import java.util.HashMap;
import java.util.LinkedHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public abstract class i3n {
    public static final tfj a = new tfj(new vwj(29), new m4k(16));
    public static final tfj b = new tfj(new m4k(0), new m4k(1));
    public static final tfj c = new tfj(new m4k(2), new m4k(3));
    public static final tfj d = new tfj(new m4k(4), new m4k(5));
    public static final tfj e = new tfj(new m4k(6), new m4k(7));
    public static final tfj f = new tfj(new m4k(8), new m4k(9));
    public static final tfj g = new tfj(new m4k(10), new m4k(11));
    public static final tfj h = new tfj(new m4k(12), new m4k(13));
    public static final tfj i = new tfj(new m4k(14), new m4k(15));

    public static final zrf a(nwa nwaVar) {
        nwa X = nwaVar.X();
        if (X != null) {
            return X.y(nwaVar, true);
        }
        return new zrf(0.0f, 0.0f, (int) (nwaVar.h() >> 32), (int) (nwaVar.h() & 4294967295L));
    }

    public static final zrf b(nwa nwaVar, boolean z) {
        nwa c2 = c(nwaVar);
        float h2 = (int) (c2.h() >> 32);
        float h3 = (int) (c2.h() & 4294967295L);
        zrf y = c2.y(nwaVar, z);
        float f2 = y.a;
        float f3 = 0.0f;
        if (z) {
            if (f2 < 0.0f) {
                f2 = 0.0f;
            }
            if (f2 > h2) {
                f2 = h2;
            }
        }
        float f4 = y.b;
        if (z) {
            if (f4 < 0.0f) {
                f4 = 0.0f;
            }
            if (f4 > h3) {
                f4 = h3;
            }
        }
        float f5 = y.c;
        if (z) {
            if (f5 < 0.0f) {
                f5 = 0.0f;
            }
            if (f5 <= h2) {
                h2 = f5;
            }
            f5 = h2;
        }
        float f6 = y.d;
        if (z) {
            if (f6 >= 0.0f) {
                f3 = f6;
            }
            if (f3 <= h3) {
                h3 = f3;
            }
            f6 = h3;
        }
        if (f2 == f5 || f4 == f6) {
            return zrf.e;
        }
        long C = c2.C((Float.floatToRawIntBits(f2) << 32) | (Float.floatToRawIntBits(f4) & 4294967295L));
        long C2 = c2.C((Float.floatToRawIntBits(f5) << 32) | (Float.floatToRawIntBits(f4) & 4294967295L));
        long C3 = c2.C((Float.floatToRawIntBits(f5) << 32) | (Float.floatToRawIntBits(f6) & 4294967295L));
        long C4 = c2.C((Float.floatToRawIntBits(f6) & 4294967295L) | (Float.floatToRawIntBits(f2) << 32));
        float intBitsToFloat = Float.intBitsToFloat((int) (C >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (C2 >> 32));
        float intBitsToFloat3 = Float.intBitsToFloat((int) (C4 >> 32));
        float intBitsToFloat4 = Float.intBitsToFloat((int) (C3 >> 32));
        float min = Math.min(intBitsToFloat, Math.min(intBitsToFloat2, Math.min(intBitsToFloat3, intBitsToFloat4)));
        float max = Math.max(intBitsToFloat, Math.max(intBitsToFloat2, Math.max(intBitsToFloat3, intBitsToFloat4)));
        float intBitsToFloat5 = Float.intBitsToFloat((int) (C & 4294967295L));
        float intBitsToFloat6 = Float.intBitsToFloat((int) (C2 & 4294967295L));
        float intBitsToFloat7 = Float.intBitsToFloat((int) (C4 & 4294967295L));
        float intBitsToFloat8 = Float.intBitsToFloat((int) (C3 & 4294967295L));
        return new zrf(min, Math.min(intBitsToFloat5, Math.min(intBitsToFloat6, Math.min(intBitsToFloat7, intBitsToFloat8))), max, Math.max(intBitsToFloat5, Math.max(intBitsToFloat6, Math.max(intBitsToFloat7, intBitsToFloat8))));
    }

    public static final nwa c(nwa nwaVar) {
        nwa nwaVar2;
        x8d x8dVar;
        nwa X = nwaVar.X();
        while (true) {
            nwa nwaVar3 = X;
            nwaVar2 = nwaVar;
            nwaVar = nwaVar3;
            if (nwaVar == null) {
                break;
            }
            X = nwaVar.X();
        }
        if (nwaVar2 instanceof x8d) {
            x8dVar = (x8d) nwaVar2;
        } else {
            x8dVar = null;
        }
        if (x8dVar == null) {
            return nwaVar2;
        }
        x8d x8dVar2 = x8dVar.t;
        while (true) {
            x8d x8dVar3 = x8dVar2;
            x8d x8dVar4 = x8dVar;
            x8dVar = x8dVar3;
            if (x8dVar != null) {
                x8dVar2 = x8dVar.t;
            } else {
                return x8dVar4;
            }
        }
    }

    public static final long d(nwa nwaVar) {
        nwa X = nwaVar.X();
        if (X == null) {
            return 0L;
        }
        return X.s(nwaVar, 0L);
    }

    public static final f4k e(JSONObject jSONObject) {
        String str;
        String str2;
        String str3;
        Object obj;
        String str4;
        LinkedHashMap linkedHashMap;
        HashMap hashMap;
        if (jSONObject != null) {
            try {
                if (jSONObject.has("key")) {
                    str = jSONObject.getString("key");
                } else {
                    str = null;
                }
                if (jSONObject.has("value")) {
                    str2 = jSONObject.getString("value");
                } else {
                    str2 = null;
                }
                if (str != null || str2 != null) {
                    if (str == null && str2 != null) {
                        str3 = str2;
                    } else {
                        str3 = str;
                    }
                    if (jSONObject.has("payload")) {
                        obj = jSONObject.get("payload");
                    } else {
                        obj = null;
                    }
                    if (jSONObject.has("expKey")) {
                        str4 = jSONObject.getString("expKey");
                    } else {
                        str4 = null;
                    }
                    if (jSONObject.has(RadarTripOptions.KEY_METADATA)) {
                        JSONObject jSONObject2 = jSONObject.getJSONObject(RadarTripOptions.KEY_METADATA);
                        jSONObject2.getClass();
                        linkedHashMap = nwm.h(jSONObject2);
                    } else {
                        linkedHashMap = null;
                    }
                    if (linkedHashMap != null) {
                        hashMap = new LinkedHashMap(linkedHashMap);
                    } else {
                        hashMap = null;
                    }
                    if (hashMap != null && hashMap.get("experimentKey") != null) {
                        Object obj2 = hashMap.get("experimentKey");
                        if (obj2 instanceof String) {
                            str4 = (String) obj2;
                        } else {
                            str4 = null;
                        }
                    } else if (str4 != null) {
                        if (hashMap == null) {
                            hashMap = new HashMap();
                        }
                        hashMap.put("experimentKey", str4);
                    }
                    return new f4k(str2, obj, str4, str3, hashMap);
                }
            } catch (JSONException e2) {
                e2.printStackTrace();
                ao.a.a("Error parsing Variant from json string " + jSONObject + ", " + e2);
                return null;
            }
        }
        return null;
    }
}
