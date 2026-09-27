package org.webrtc;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public class MediaConstraints {
    public final List<KeyValuePair> mandatory = new ArrayList();
    public final List<KeyValuePair> optional = new ArrayList();

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    /* loaded from: classes6.dex */
    public static class KeyValuePair {
        private final String key;
        private final String value;

        public KeyValuePair(String str, String str2) {
            this.key = str;
            this.value = str2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && getClass() == obj.getClass()) {
                KeyValuePair keyValuePair = (KeyValuePair) obj;
                if (this.key.equals(keyValuePair.key) && this.value.equals(keyValuePair.value)) {
                    return true;
                }
            }
            return false;
        }

        public String getKey() {
            return this.key;
        }

        public String getValue() {
            return this.value;
        }

        public int hashCode() {
            return this.value.hashCode() + this.key.hashCode();
        }

        public String toString() {
            return this.key + ": " + this.value;
        }
    }

    private static String stringifyKeyValuePairList(List<KeyValuePair> list) {
        StringBuilder sb = new StringBuilder("[");
        for (KeyValuePair keyValuePair : list) {
            if (sb.length() > 1) {
                sb.append(", ");
            }
            sb.append(keyValuePair.toString());
        }
        sb.append("]");
        return sb.toString();
    }

    public List<KeyValuePair> getMandatory() {
        return this.mandatory;
    }

    public List<KeyValuePair> getOptional() {
        return this.optional;
    }

    public String toString() {
        return "mandatory: " + stringifyKeyValuePairList(this.mandatory) + ", optional: " + stringifyKeyValuePairList(this.optional);
    }
}
