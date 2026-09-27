package defpackage;

import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.util.ArrayList;
import java.util.Collection;
import javax.crypto.KeyAgreement;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public abstract class pyn {
    public static SecretKeySpec a(ECPublicKey eCPublicKey, ECPrivateKey eCPrivateKey) {
        try {
            KeyAgreement keyAgreement = KeyAgreement.getInstance("ECDH");
            try {
                keyAgreement.init(eCPrivateKey);
                keyAgreement.doPhase(eCPublicKey, true);
                return new SecretKeySpec(keyAgreement.generateSecret(), "AES");
            } catch (InvalidKeyException e) {
                throw new Exception("Invalid key for ECDH key agreement: " + e.getMessage(), e);
            }
        } catch (NoSuchAlgorithmException e2) {
            throw new Exception("Couldn't get an ECDH key agreement instance: " + e2.getMessage(), e2);
        }
    }

    public static final ArrayList b(Collection collection) {
        collection.getClass();
        if (collection instanceof ArrayList) {
            return (ArrayList) collection;
        }
        return new ArrayList(collection);
    }
}
