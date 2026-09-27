package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public abstract class gmn {
    public static sd3 a(String str) {
        return new sd3(fgf.InvalidDataElementFormat.a(), "Data element not in the required format or value is invalid as defined in Table A.1", str);
    }

    public static sd3 b(String str) {
        return new sd3(fgf.RequiredDataElementMissing.a(), "A message element required as defined in Table A.1 is missing from the message.", str);
    }
}
