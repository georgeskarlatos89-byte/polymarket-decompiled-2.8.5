package defpackage;

import com.launchdarkly.sdk.LDValue;
import com.polymarket.data.EFeatureFlagKey;
import com.polymarket.data.EFeatureFlagKt;
import com.polymarket.data.EFeatureFlagValue;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Pair;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public abstract class wx {
    /* JADX WARN: Removed duplicated region for block: B:10:0x00c2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Map a(Map map) {
        EFeatureFlagValue json;
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            LDValue lDValue = (LDValue) entry.getValue();
            EFeatureFlagKey EFeatureFlagKey = EFeatureFlagKt.EFeatureFlagKey(str);
            Pair pair = null;
            if (EFeatureFlagKey != null) {
                lDValue.getClass();
                if (!lDValue.h()) {
                    if (lDValue.e() == fva.BOOLEAN) {
                        json = EFeatureFlagValue.INSTANCE.bool(lDValue.a());
                    } else if (lDValue.i()) {
                        double b = lDValue.b();
                        if (!Double.isNaN(b) && !Double.isInfinite(b)) {
                            if (lDValue.g()) {
                                long l = lDValue.l();
                                if (-2147483648L <= l && l <= 2147483647L) {
                                    json = EFeatureFlagValue.INSTANCE.m40int(lDValue.f());
                                }
                            }
                            json = EFeatureFlagValue.INSTANCE.m39double(b);
                        }
                    } else if (lDValue.j()) {
                        EFeatureFlagValue.Companion companion = EFeatureFlagValue.INSTANCE;
                        String p = lDValue.p();
                        p.getClass();
                        json = companion.string(p);
                    } else if (lDValue.e() == fva.ARRAY || lDValue.e() == fva.OBJECT) {
                        EFeatureFlagValue.Companion companion2 = EFeatureFlagValue.INSTANCE;
                        String q = lDValue.q();
                        q.getClass();
                        json = companion2.json(q);
                    }
                    if (json != null) {
                        pair = new Pair(EFeatureFlagKey, json);
                    }
                }
                json = null;
                if (json != null) {
                }
            }
            if (pair != null) {
                arrayList.add(pair);
            }
        }
        return d1c.n(arrayList);
    }
}
