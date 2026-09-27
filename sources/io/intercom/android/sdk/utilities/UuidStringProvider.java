package io.intercom.android.sdk.utilities;

import java.util.UUID;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public interface UuidStringProvider {
    public static final UuidStringProvider SYSTEM = new UuidStringProvider() { // from class: io.intercom.android.sdk.utilities.UuidStringProvider.1
        @Override // io.intercom.android.sdk.utilities.UuidStringProvider
        public String newUuidString() {
            return UUID.randomUUID().toString();
        }
    };

    String newUuidString();
}
