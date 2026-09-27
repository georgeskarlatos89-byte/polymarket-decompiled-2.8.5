package io.intercom.android.sdk.utilities;

import android.security.keystore.KeyGenParameterSpec;
import android.util.Base64;
import com.intercom.twig.Twig;
import io.intercom.android.sdk.logger.LumberMill;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.UnrecoverableKeyException;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.text.Charsets;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001:\u0002\u001f B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u0007H\u0000¢\u0006\u0002\b\u0016J\u0015\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u0007H\u0000¢\u0006\u0002\b\u0019J\u0014\u0010\u001a\u001a\u00020\u001b2\n\u0010\u001c\u001a\u00060\u001dj\u0002`\u001eH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u0082T¢\u0006\u0002\n\u0000R$\u0010\r\u001a\u00020\u000e8\u0000@\u0000X\u0081\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u000f\u0010\u0003\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006!"}, d2 = {"Lio/intercom/android/sdk/utilities/CryptoHelper;", "", "<init>", "()V", "twig", "Lcom/intercom/twig/Twig;", "KEY_ALIAS", "", "ANDROID_KEYSTORE", "TRANSFORMATION", "GCM_IV_LENGTH", "", "GCM_TAG_LENGTH", "keyProvider", "Lio/intercom/android/sdk/utilities/CryptoHelper$KeyProvider;", "getKeyProvider$intercom_sdk_base_release$annotations", "getKeyProvider$intercom_sdk_base_release", "()Lio/intercom/android/sdk/utilities/CryptoHelper$KeyProvider;", "setKeyProvider$intercom_sdk_base_release", "(Lio/intercom/android/sdk/utilities/CryptoHelper$KeyProvider;)V", "encrypt", "plaintext", "encrypt$intercom_sdk_base_release", "decrypt", "encrypted", "decrypt$intercom_sdk_base_release", "handleKeyStoreError", "", "e", "Ljava/lang/Exception;", "Lkotlin/Exception;", "KeyProvider", "AndroidKeystoreKeyProvider", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CryptoHelper {
    public static final int $stable;
    private static final String ANDROID_KEYSTORE = "AndroidKeyStore";
    private static final int GCM_IV_LENGTH = 12;
    private static final int GCM_TAG_LENGTH = 128;
    public static final CryptoHelper INSTANCE = new CryptoHelper();
    private static final String KEY_ALIAS = "intercom_sdk_prefs_key";
    private static final String TRANSFORMATION = "AES/GCM/NoPadding";
    private static KeyProvider keyProvider;
    private static final Twig twig;

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0007H\u0016J\b\u0010\b\u001a\u00020\u0005H\u0002¨\u0006\t"}, d2 = {"Lio/intercom/android/sdk/utilities/CryptoHelper$AndroidKeystoreKeyProvider;", "Lio/intercom/android/sdk/utilities/CryptoHelper$KeyProvider;", "<init>", "()V", "getOrCreateKey", "Ljavax/crypto/SecretKey;", "deleteKey", "", "generateKey", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class AndroidKeystoreKeyProvider implements KeyProvider {
        public static final AndroidKeystoreKeyProvider INSTANCE = new AndroidKeystoreKeyProvider();

        private AndroidKeystoreKeyProvider() {
        }

        private final SecretKey generateKey() {
            KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", CryptoHelper.ANDROID_KEYSTORE);
            KeyGenParameterSpec build = new KeyGenParameterSpec.Builder(CryptoHelper.KEY_ALIAS, 3).setBlockModes("GCM").setEncryptionPaddings("NoPadding").setKeySize(256).build();
            build.getClass();
            keyGenerator.init(build);
            SecretKey generateKey = keyGenerator.generateKey();
            generateKey.getClass();
            return generateKey;
        }

        @Override // io.intercom.android.sdk.utilities.CryptoHelper.KeyProvider
        public void deleteKey() {
            KeyStore keyStore = KeyStore.getInstance(CryptoHelper.ANDROID_KEYSTORE);
            keyStore.load(null);
            keyStore.deleteEntry(CryptoHelper.KEY_ALIAS);
        }

        @Override // io.intercom.android.sdk.utilities.CryptoHelper.KeyProvider
        public SecretKey getOrCreateKey() {
            KeyStore keyStore = KeyStore.getInstance(CryptoHelper.ANDROID_KEYSTORE);
            KeyStore.SecretKeyEntry secretKeyEntry = null;
            keyStore.load(null);
            KeyStore.Entry entry = keyStore.getEntry(CryptoHelper.KEY_ALIAS, null);
            if (entry instanceof KeyStore.SecretKeyEntry) {
                secretKeyEntry = (KeyStore.SecretKeyEntry) entry;
            }
            if (secretKeyEntry != null) {
                SecretKey secretKey = secretKeyEntry.getSecretKey();
                secretKey.getClass();
                return secretKey;
            }
            return generateKey();
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\b`\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lio/intercom/android/sdk/utilities/CryptoHelper$KeyProvider;", "", "getOrCreateKey", "Ljavax/crypto/SecretKey;", "deleteKey", "", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public interface KeyProvider {
        void deleteKey();

        SecretKey getOrCreateKey();
    }

    static {
        Twig logger = LumberMill.getLogger();
        logger.getClass();
        twig = logger;
        keyProvider = AndroidKeystoreKeyProvider.INSTANCE;
        $stable = 8;
    }

    private CryptoHelper() {
    }

    private final void handleKeyStoreError(Exception e) {
        twig.w(e, "Keystore error, regenerating key. Data encrypted with old key will be lost.", new Object[0]);
        try {
            keyProvider.deleteKey();
            keyProvider.getOrCreateKey();
        } catch (Exception e2) {
            twig.w(e2, "failed to regenerate key", new Object[0]);
        }
    }

    public final String decrypt$intercom_sdk_base_release(String encrypted) {
        encrypted.getClass();
        if (encrypted.length() == 0) {
            return "";
        }
        try {
            SecretKey orCreateKey = keyProvider.getOrCreateKey();
            byte[] decode = Base64.decode(encrypted, 2);
            if (decode.length <= 12) {
                return "";
            }
            byte[] copyOfRange = ArraysKt.copyOfRange(decode, 0, 12);
            byte[] copyOfRange2 = ArraysKt.copyOfRange(decode, 12, decode.length);
            Cipher cipher = Cipher.getInstance(TRANSFORMATION);
            cipher.init(2, orCreateKey, new GCMParameterSpec(128, copyOfRange));
            byte[] doFinal = cipher.doFinal(copyOfRange2);
            doFinal.getClass();
            return new String(doFinal, Charsets.UTF_8);
        } catch (KeyStoreException e) {
            handleKeyStoreError(e);
            return "";
        } catch (UnrecoverableKeyException e2) {
            handleKeyStoreError(e2);
            return "";
        } catch (Exception e3) {
            twig.w(e3, "decryption failed", new Object[0]);
            return "";
        }
    }

    public final String encrypt$intercom_sdk_base_release(String plaintext) {
        plaintext.getClass();
        if (plaintext.length() == 0) {
            return "";
        }
        try {
            SecretKey orCreateKey = keyProvider.getOrCreateKey();
            Cipher cipher = Cipher.getInstance(TRANSFORMATION);
            cipher.init(1, orCreateKey);
            byte[] iv = cipher.getIV();
            byte[] bytes = plaintext.getBytes(Charsets.UTF_8);
            bytes.getClass();
            byte[] doFinal = cipher.doFinal(bytes);
            iv.getClass();
            doFinal.getClass();
            return Base64.encodeToString(ArraysKt.Q(iv, doFinal), 2);
        } catch (KeyStoreException e) {
            this.handleKeyStoreError(e);
            return "";
        } catch (UnrecoverableKeyException e2) {
            this.handleKeyStoreError(e2);
            return "";
        } catch (Exception e3) {
            twig.w(e3, "encryption failed", new Object[0]);
            return "";
        }
    }

    public final KeyProvider getKeyProvider$intercom_sdk_base_release() {
        return keyProvider;
    }

    public final void setKeyProvider$intercom_sdk_base_release(KeyProvider keyProvider2) {
        keyProvider2.getClass();
        keyProvider = keyProvider2;
    }

    public static /* synthetic */ void getKeyProvider$intercom_sdk_base_release$annotations() {
    }
}
