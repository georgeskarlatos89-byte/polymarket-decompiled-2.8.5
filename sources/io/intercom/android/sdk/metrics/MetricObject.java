package io.intercom.android.sdk.metrics;

import com.google.gson.annotations.SerializedName;
import defpackage.ix2;
import io.intercom.android.sdk.utilities.commons.TimeProvider;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public class MetricObject {
    static final String KEY_ACTION = "action";
    private static final String KEY_ANDROID_INSTALLER_PACKAGE_NAME = "android_installer_package_name";
    private static final String KEY_ANDROID_IS_DEBUG_BUILD = "android_is_debug_build";
    static final String KEY_APP_MIN_SDK_VERSION = "app_min_sdk_version";
    static final String KEY_APP_NAME = "app_name";
    static final String KEY_APP_VERSION = "app_version";
    static final String KEY_CONTEXT = "context";
    static final String KEY_CONVERSATION_SHOWN = "conversation_shown";
    static final String KEY_OBJECT = "object";
    static final String KEY_OWNER = "owner";
    static final String KEY_PLACE = "place";
    static final String KEY_SDK_VERSION = "sdk_version";
    static final String KEY_USER_ID = "user_id";

    @SerializedName("created_at")
    private final long createdAt;
    private final String id;
    private final Map<String, Object> metadata;
    private final String name;

    public MetricObject(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, TimeProvider timeProvider, String str9, String str10, String str11, String str12) {
        HashMap hashMap = new HashMap();
        this.metadata = hashMap;
        this.name = str;
        this.createdAt = timeProvider.currentTimeMillis() / 1000;
        this.id = str3;
        hashMap.put(KEY_ACTION, str5);
        hashMap.put(KEY_OBJECT, str6);
        hashMap.put(KEY_PLACE, str7);
        hashMap.put(KEY_CONTEXT, str8);
        hashMap.put(KEY_OWNER, str2);
        hashMap.put(KEY_APP_MIN_SDK_VERSION, str11);
        hashMap.put(KEY_APP_NAME, str12);
        if (!str4.isEmpty()) {
            hashMap.put(KEY_USER_ID, str4);
        }
        hashMap.put("sdk_version", str10);
        hashMap.put(KEY_APP_VERSION, str9);
    }

    public MetricObject addInstallerPackageName(String str) {
        addMetaData(KEY_ANDROID_INSTALLER_PACKAGE_NAME, str);
        return this;
    }

    public MetricObject addIsDebugBuild(boolean z) {
        addMetaData(KEY_ANDROID_IS_DEBUG_BUILD, Boolean.valueOf(z));
        return this;
    }

    public MetricObject addMetaData(String str, Object obj) {
        this.metadata.put(str, obj);
        return this;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            MetricObject metricObject = (MetricObject) obj;
            if (this.createdAt != metricObject.createdAt || !this.metadata.equals(metricObject.metadata)) {
                return false;
            }
            String str = this.id;
            String str2 = metricObject.id;
            if (str != null) {
                return str.equals(str2);
            }
            if (str2 == null) {
                return true;
            }
        }
        return false;
    }

    public long getCreatedAt() {
        return this.createdAt;
    }

    public String getId() {
        return this.id;
    }

    public Map<String, Object> getMetadata() {
        return this.metadata;
    }

    public String getName() {
        return this.name;
    }

    public int hashCode() {
        int i;
        int hashCode = this.metadata.hashCode() * 31;
        String str = this.id;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i2 = (hashCode + i) * 31;
        long j = this.createdAt;
        return i2 + ((int) (j ^ (j >>> 32)));
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("MetricObject{metadata=");
        sb.append(this.metadata);
        sb.append(", id='");
        sb.append(this.id);
        sb.append("', createdAt=");
        return ix2.n(sb, this.createdAt, '}');
    }
}
