package defpackage;

import java.security.InvalidAlgorithmParameterException;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class z3f implements w3f {
    public static final p3j e = p3j.ALGORITHM_REQUIRES_BORINGCRYPTO;
    public final y3f a;
    public final String b;
    public final SecretKeySpec c;
    public final int d;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x005c, code lost:
    
        if (r4.equals("HMACSHA1") == false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public z3f(String str, SecretKeySpec secretKeySpec) {
        char c = 0;
        y3f y3fVar = new y3f(this, 0);
        this.a = y3fVar;
        if (e.a()) {
            this.b = str;
            this.c = secretKeySpec;
            if (secretKeySpec.getEncoded().length >= 16) {
                switch (str.hashCode()) {
                    case -1823053428:
                        break;
                    case 392315023:
                        if (str.equals("HMACSHA224")) {
                            c = 1;
                            break;
                        }
                        c = 65535;
                        break;
                    case 392315118:
                        if (str.equals("HMACSHA256")) {
                            c = 2;
                            break;
                        }
                        c = 65535;
                        break;
                    case 392316170:
                        if (str.equals("HMACSHA384")) {
                            c = 3;
                            break;
                        }
                        c = 65535;
                        break;
                    case 392317873:
                        if (str.equals("HMACSHA512")) {
                            c = 4;
                            break;
                        }
                        c = 65535;
                        break;
                    default:
                        c = 65535;
                        break;
                }
                switch (c) {
                    case 0:
                        this.d = 20;
                        break;
                    case 1:
                        this.d = 28;
                        break;
                    case 2:
                        this.d = 32;
                        break;
                    case 3:
                        this.d = 48;
                        break;
                    case 4:
                        this.d = 64;
                        break;
                    default:
                        throw new NoSuchAlgorithmException("unknown Hmac algorithm: ".concat(str));
                }
                y3fVar.get();
                return;
            }
            throw new InvalidAlgorithmParameterException("key size too small, need at least 16 bytes");
        }
        fi9.r("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
        throw null;
    }

    @Override // defpackage.w3f
    public final byte[] a(int i, byte[] bArr) {
        if (i <= this.d) {
            y3f y3fVar = this.a;
            ((Mac) y3fVar.get()).update(bArr);
            return Arrays.copyOf(((Mac) y3fVar.get()).doFinal(), i);
        }
        throw new InvalidAlgorithmParameterException("tag size too big");
    }
}
