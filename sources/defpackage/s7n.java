package defpackage;

import com.socure.docv.capturesdk.common.utils.ApiConstant;
import java.io.ByteArrayInputStream;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import kotlin.collections.ArraysKt;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public abstract class s7n {
    public static final String a(String str) {
        char[] charArray = str.toCharArray();
        charArray.getClass();
        return ArraysKt.G(ApiConstant.SPACE, charArray);
    }

    public static X509Certificate b(byte[] bArr) {
        if (bArr.length == 0) {
            return null;
        }
        Certificate generateCertificate = CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(bArr));
        if (generateCertificate instanceof X509Certificate) {
            return (X509Certificate) generateCertificate;
        }
        throw new CertificateException("Not a X.509 certificate: " + generateCertificate.getType());
    }

    public static int c(CharSequence charSequence, int i) {
        char charAt;
        char charAt2;
        while (i < charSequence.length() && ((charAt2 = charSequence.charAt(i)) == ' ' || charAt2 == '\t')) {
            i++;
        }
        if (i < charSequence.length() && charSequence.charAt(i) == '\n') {
            while (true) {
                i++;
                if (i >= charSequence.length() || ((charAt = charSequence.charAt(i)) != ' ' && charAt != '\t')) {
                    break;
                }
            }
        }
        return i;
    }
}
