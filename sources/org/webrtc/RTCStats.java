package org.webrtc;

import defpackage.sv6;
import java.util.Map;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public class RTCStats {
    private final String id;
    private final Map<String, Object> members;
    private final long timestampUs;
    private final String type;

    public RTCStats(long j, String str, String str2, Map<String, Object> map) {
        this.timestampUs = j;
        this.type = str;
        this.id = str2;
        this.members = map;
    }

    private static void appendValue(StringBuilder sb, Object obj) {
        if (obj instanceof Object[]) {
            Object[] objArr = (Object[]) obj;
            sb.append('[');
            for (int i = 0; i < objArr.length; i++) {
                if (i != 0) {
                    sb.append(", ");
                }
                appendValue(sb, objArr[i]);
            }
            sb.append(']');
            return;
        }
        if (obj instanceof String) {
            sb.append('\"');
            sb.append(obj);
            sb.append('\"');
            return;
        }
        sb.append(obj);
    }

    public static RTCStats create(long j, String str, String str2, Map map) {
        return new RTCStats(j, str, str2, map);
    }

    public String getId() {
        return this.id;
    }

    public Map<String, Object> getMembers() {
        return this.members;
    }

    public double getTimestampUs() {
        return this.timestampUs;
    }

    public String getType() {
        return this.type;
    }

    public String toString() {
        StringBuilder s = sv6.s("{ timestampUs: ");
        s.append(this.timestampUs);
        s.append(", type: ");
        s.append(this.type);
        s.append(", id: ");
        s.append(this.id);
        for (Map.Entry<String, Object> entry : this.members.entrySet()) {
            s.append(", ");
            s.append(entry.getKey());
            s.append(": ");
            appendValue(s, entry.getValue());
        }
        s.append(" }");
        return s.toString();
    }
}
