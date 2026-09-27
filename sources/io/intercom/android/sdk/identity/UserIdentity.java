package io.intercom.android.sdk.identity;

import io.intercom.android.sdk.identity.UserIdentityStore;
import io.intercom.android.sdk.models.User;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public class UserIdentity {
    public static final String ANONYMOUS_ID = "anonymous_id";
    public static final String EMAIL = "email";
    public static final String INTERCOM_ID = "intercom_id";
    private static final String TYPE = "type";
    private static final String USER = "user";
    private static final String USER_ID = "user_id";
    private String anonymousId;
    private String email;
    private String encryptedUserId;
    private String fingerprint;
    private String hmac;
    private String intercomId;
    private String jwt;
    private SoftUserIdentity softUserIdentity = SoftUserIdentity.NONE;
    private final UserIdentityStore store;
    private String userId;

    public UserIdentity(UserIdentityStore userIdentityStore) {
        this.fingerprint = "";
        this.store = userIdentityStore;
        UserIdentityStore.UserFields loadUserFields = userIdentityStore.loadUserFields();
        this.anonymousId = loadUserFields.getAnonymousId();
        this.intercomId = loadUserFields.getIntercomId();
        this.userId = loadUserFields.getUserId();
        this.email = loadUserFields.getEmail();
        this.hmac = loadUserFields.getHmac();
        this.jwt = loadUserFields.getJwt();
        this.encryptedUserId = "";
        if (identityExists()) {
            this.fingerprint = generateFingerprint();
        }
    }

    private String generateFingerprint() {
        return UUID.randomUUID().toString();
    }

    public String getAnonymousId() {
        return this.anonymousId;
    }

    public String getEmail() {
        return this.email;
    }

    public String getEncryptedUserId() {
        return this.encryptedUserId;
    }

    public String getFingerprint() {
        return this.fingerprint;
    }

    public String getHmac() {
        return this.hmac;
    }

    public String getIntercomId() {
        return this.intercomId;
    }

    public String getJwt() {
        return this.jwt;
    }

    public String getSoftUserIdentityHmac() {
        return this.softUserIdentity.hmac();
    }

    public String getUserId() {
        return this.userId;
    }

    public void hardReset() {
        this.softUserIdentity = SoftUserIdentity.NONE;
    }

    public boolean hasIntercomId() {
        return !getIntercomId().isEmpty();
    }

    public boolean identityExists() {
        if (this.email.isEmpty() && this.userId.isEmpty() && this.intercomId.isEmpty() && this.anonymousId.isEmpty()) {
            return false;
        }
        return true;
    }

    public boolean isIdentified() {
        if (identityExists() && !isUnidentified()) {
            return true;
        }
        return false;
    }

    public boolean isSoftReset() {
        return this.softUserIdentity.isPresent();
    }

    public boolean isUnidentified() {
        if (!this.anonymousId.isEmpty() && this.email.isEmpty() && this.userId.isEmpty()) {
            return true;
        }
        return false;
    }

    public void registerIdentifiedUser(Registration registration) {
        this.intercomId = "";
        if (!registration.getUserId().isEmpty()) {
            this.userId = registration.getUserId();
        }
        if (!registration.getEmail().isEmpty()) {
            this.email = registration.getEmail();
        }
        this.store.save(new UserIdentityStore.UserFields(this.anonymousId, this.intercomId, this.userId, this.email, this.hmac, this.jwt));
        if (this.fingerprint.isEmpty()) {
            this.fingerprint = generateFingerprint();
        }
    }

    public void registerUnidentifiedUser() {
        String uuid = UUID.randomUUID().toString();
        this.anonymousId = uuid;
        this.store.save(new UserIdentityStore.UserFields(uuid, this.intercomId, this.userId, this.email, this.hmac, this.jwt));
        if (this.fingerprint.isEmpty()) {
            this.fingerprint = generateFingerprint();
        }
    }

    public boolean registrationHasAttributes(Registration registration) {
        if (registration != null && registration.getAttributes() != null && !registration.getAttributes().isEmpty()) {
            return true;
        }
        return false;
    }

    public void setJwt(String str) {
        this.jwt = str;
        this.store.save(new UserIdentityStore.UserFields(this.anonymousId, this.intercomId, this.userId, this.email, this.hmac, str));
    }

    public void setUserHash(String str) {
        this.hmac = str;
        this.store.save(new UserIdentityStore.UserFields(this.anonymousId, this.intercomId, this.userId, this.email, str, this.jwt));
    }

    public boolean softIdentityIsSameUser(Registration registration) {
        if (isUnidentified()) {
            return false;
        }
        return this.softUserIdentity.isSameUser(registration);
    }

    public synchronized void softReset() {
        if (!isSoftReset()) {
            this.softUserIdentity = SoftUserIdentity.create(this.anonymousId, this.email, this.fingerprint, this.hmac, this.jwt, this.intercomId, this.userId, this.encryptedUserId);
            this.store.clear();
            this.anonymousId = "";
            this.intercomId = "";
            this.encryptedUserId = "";
            this.userId = "";
            this.email = "";
            this.hmac = "";
            this.jwt = "";
            this.fingerprint = "";
        }
    }

    public void softRestart() {
        this.userId = this.softUserIdentity.userId();
        this.email = this.softUserIdentity.email();
        this.anonymousId = this.softUserIdentity.anonymousId();
        this.intercomId = this.softUserIdentity.intercomId();
        this.encryptedUserId = this.softUserIdentity.encryptedUserId();
        this.hmac = this.softUserIdentity.hmac();
        this.jwt = this.softUserIdentity.jwt();
        this.fingerprint = this.softUserIdentity.fingerprint();
        this.store.save(new UserIdentityStore.UserFields(this.anonymousId, this.intercomId, this.userId, this.email, this.hmac, this.jwt));
        this.softUserIdentity = SoftUserIdentity.NONE;
    }

    public boolean softUserIdentityHmacDiffers(String str) {
        if (this.softUserIdentity.isPresent() && !getSoftUserIdentityHmac().equals(str)) {
            return true;
        }
        return false;
    }

    public boolean softUserIdentityJwtDiffers(String str) {
        if (this.softUserIdentity.isPresent() && !this.softUserIdentity.jwt().equals(str)) {
            return true;
        }
        return false;
    }

    public Map<String, Object> softUserIdentityToMap() {
        HashMap hashMap = new HashMap();
        String anonymousId = this.softUserIdentity.anonymousId();
        String intercomId = this.softUserIdentity.intercomId();
        String userId = this.softUserIdentity.userId();
        String email = this.softUserIdentity.email();
        if (!anonymousId.isEmpty()) {
            hashMap.put(ANONYMOUS_ID, anonymousId);
        } else if (!intercomId.isEmpty()) {
            hashMap.put(INTERCOM_ID, intercomId);
        }
        if (!userId.isEmpty()) {
            hashMap.put(USER_ID, userId);
        }
        if (!email.isEmpty()) {
            hashMap.put("email", email);
        }
        hashMap.put("type", "user");
        return hashMap;
    }

    public Map<String, Object> toMap() {
        HashMap hashMap = new HashMap();
        if (!this.anonymousId.isEmpty()) {
            hashMap.put(ANONYMOUS_ID, this.anonymousId);
        } else if (!this.intercomId.isEmpty()) {
            hashMap.put(INTERCOM_ID, this.intercomId);
        }
        if (!this.userId.isEmpty()) {
            hashMap.put(USER_ID, this.userId);
        }
        if (!this.email.isEmpty()) {
            hashMap.put("email", this.email);
        }
        hashMap.put("type", "user");
        return hashMap;
    }

    public synchronized void update(User user) {
        try {
            if (user == User.NULL) {
                return;
            }
            this.userId = user.getUserId();
            this.email = user.getEmail();
            this.anonymousId = user.getAnonymousId();
            this.encryptedUserId = user.getEncryptedUserId();
            if (!user.getIntercomId().isEmpty()) {
                this.intercomId = user.getIntercomId();
            }
            this.store.save(new UserIdentityStore.UserFields(this.anonymousId, this.intercomId, this.userId, this.email, this.hmac, this.jwt));
        } catch (Throwable th) {
            throw th;
        }
    }
}
