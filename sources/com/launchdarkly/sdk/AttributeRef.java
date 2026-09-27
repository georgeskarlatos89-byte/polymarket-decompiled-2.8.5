package com.launchdarkly.sdk;

import com.google.gson.annotations.JsonAdapter;
import com.socure.docv.capturesdk.api.Keys;
import defpackage.yfa;
import io.ably.lib.util.AgentHeaderCreator;
import java.util.HashMap;
import java.util.Map;
import okhttp3.internal.ws.WebSocketProtocol;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@JsonAdapter(AttributeRefTypeAdapter.class)
/* loaded from: classes3.dex */
public final class AttributeRef implements yfa, Comparable<AttributeRef> {
    private static final Map<String, AttributeRef> COMMON_LITERALS;
    private final String[] components;
    private final String error;
    private final String rawPath;
    private final String singlePathComponent;

    static {
        String[] strArr = {"kind", "key", Keys.KEY_NAME, "anonymous", "email", "firstName", "lastName", "country", "ip", "avatar"};
        HashMap hashMap = new HashMap();
        for (int i = 0; i < 10; i++) {
            String str = strArr[i];
            hashMap.put(str, new AttributeRef(str, str, null));
        }
        COMMON_LITERALS = hashMap;
    }

    public AttributeRef(String str, String str2, String[] strArr) {
        this.error = null;
        this.rawPath = str == null ? "" : str;
        this.singlePathComponent = str2;
        this.components = strArr;
    }

    public static AttributeRef a(String str) {
        if (str != null && !str.isEmpty()) {
            if (str.charAt(0) != '/') {
                AttributeRef attributeRef = COMMON_LITERALS.get(str);
                if (attributeRef == null) {
                    return new AttributeRef(str, str, null);
                }
                return attributeRef;
            }
            return new AttributeRef(AgentHeaderCreator.AGENT_DIVIDER + str.replace("~", "~0").replace(AgentHeaderCreator.AGENT_DIVIDER, "~1"), str, null);
        }
        return new AttributeRef("attribute reference cannot be empty", "");
    }

    public static AttributeRef b(String str) {
        if (str != null && !str.isEmpty() && !str.equals(AgentHeaderCreator.AGENT_DIVIDER)) {
            if (str.charAt(0) != '/') {
                return new AttributeRef(str, str, null);
            }
            if (str.indexOf(47, 1) < 0) {
                String e = e(str.substring(1));
                if (e == null) {
                    return new AttributeRef("attribute reference contained an escape character (~) that was not followed by 0 or 1", str);
                }
                return new AttributeRef(str, e, null);
            }
            if (str.endsWith(AgentHeaderCreator.AGENT_DIVIDER)) {
                return new AttributeRef("attribute reference contained a double slash or a trailing slash", str);
            }
            String[] split = str.substring(1).split(AgentHeaderCreator.AGENT_DIVIDER);
            for (int i = 0; i < split.length; i++) {
                String str2 = split[i];
                if (str2.isEmpty()) {
                    return new AttributeRef("attribute reference contained a double slash or a trailing slash", str);
                }
                String e2 = e(str2);
                if (e2 == null) {
                    return new AttributeRef("attribute reference contained an escape character (~) that was not followed by 0 or 1", str);
                }
                split[i] = e2;
            }
            return new AttributeRef(str, null, split);
        }
        return new AttributeRef("attribute reference cannot be empty", str);
    }

    public static String e(String str) {
        if (str.indexOf(WebSocketProtocol.PAYLOAD_SHORT) < 0) {
            return str;
        }
        StringBuilder sb = new StringBuilder(100);
        int i = 0;
        while (i < str.length()) {
            char charAt = str.charAt(i);
            if (charAt != '~') {
                sb.append(charAt);
            } else {
                i++;
                if (i < str.length()) {
                    char charAt2 = str.charAt(i);
                    if (charAt2 != '0') {
                        if (charAt2 != '1') {
                            return null;
                        }
                        sb.append('/');
                    } else {
                        sb.append('~');
                    }
                } else {
                    return null;
                }
            }
            i++;
        }
        return sb.toString();
    }

    public final String c(int i) {
        String[] strArr = this.components;
        if (strArr == null) {
            if (i != 0) {
                return null;
            }
            return this.singlePathComponent;
        }
        if (i < 0 || i >= strArr.length) {
            return null;
        }
        return strArr[i];
    }

    @Override // java.lang.Comparable
    public final int compareTo(AttributeRef attributeRef) {
        return this.rawPath.compareTo(attributeRef.rawPath);
    }

    public final int d() {
        if (this.error != null) {
            return 0;
        }
        String[] strArr = this.components;
        if (strArr == null) {
            return 1;
        }
        return strArr.length;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof AttributeRef) {
            return this.rawPath.equals(((AttributeRef) obj).rawPath);
        }
        return false;
    }

    public final int hashCode() {
        return this.rawPath.hashCode();
    }

    public final String toString() {
        return this.rawPath;
    }

    public AttributeRef(String str, String str2) {
        this.error = str;
        this.rawPath = str2 == null ? "" : str2;
        this.singlePathComponent = null;
        this.components = null;
    }
}
