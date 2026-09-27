package defpackage;

import java.io.Serializable;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public abstract class u9a implements Serializable {
    public h1e a = null;

    /* JADX WARN: Type inference failed for: r0v1, types: [h81, d81] */
    /* JADX WARN: Type inference failed for: r0v3, types: [h81, d81] */
    /* JADX WARN: Type inference failed for: r1v2, types: [h81, d81] */
    /* JADX WARN: Type inference failed for: r1v4, types: [h81, d81] */
    /* JADX WARN: Type inference failed for: r2v2, types: [h81, d81] */
    /* JADX WARN: Type inference failed for: r2v4, types: [h81, d81] */
    /* JADX WARN: Type inference failed for: r3v2, types: [h81, d81] */
    /* JADX WARN: Type inference failed for: r4v2, types: [h81, d81] */
    public static h81[] a(String str) {
        String trim = str.trim();
        int indexOf = trim.indexOf(".");
        if (indexOf != -1) {
            int i = indexOf + 1;
            int indexOf2 = trim.indexOf(".", i);
            if (indexOf2 != -1) {
                int i2 = indexOf2 + 1;
                int indexOf3 = trim.indexOf(".", i2);
                if (indexOf3 == -1) {
                    return new h81[]{new d81(trim.substring(0, indexOf)), new d81(trim.substring(i, indexOf2)), new d81(trim.substring(i2))};
                }
                int i3 = indexOf3 + 1;
                int indexOf4 = trim.indexOf(".", i3);
                if (indexOf4 != -1) {
                    if (indexOf4 != -1 && trim.indexOf(".", indexOf4 + 1) != -1) {
                        fi9.g("Invalid serialized unsecured/JWS/JWE object: Too many part delimiters");
                        return null;
                    }
                    return new h81[]{new d81(trim.substring(0, indexOf)), new d81(trim.substring(i, indexOf2)), new d81(trim.substring(i2, indexOf3)), new d81(trim.substring(i3, indexOf4)), new d81(trim.substring(indexOf4 + 1))};
                }
                fi9.g("Invalid serialized JWE object: Missing fourth delimiter");
                return null;
            }
            fi9.g("Invalid serialized unsecured/JWS/JWE object: Missing second delimiter");
            return null;
        }
        fi9.g("Invalid serialized unsecured/JWS/JWE object: Missing part delimiters");
        return null;
    }
}
