package com.socure.idplus.device.internal.mediaDevice.manager;

import android.media.AudioManager;
import kotlin.Unit;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class c {
    public final AudioManager a;
    public a b;
    public f c;
    public boolean d;

    public c(AudioManager audioManager) {
        this.a = audioManager;
    }

    public final void a() {
        Unit unit;
        if (!this.d) {
            try {
                if (this.a != null) {
                    if (this.b == null) {
                        this.b = new a(new b(this));
                    }
                    this.d = b();
                    unit = Unit.INSTANCE;
                } else {
                    unit = null;
                }
                if (unit == null) {
                    com.socure.idplus.device.internal.logger.a aVar = com.socure.idplus.device.internal.logger.a.D;
                }
            } catch (Exception e) {
                e.getLocalizedMessage();
                com.socure.idplus.device.internal.logger.a aVar2 = com.socure.idplus.device.internal.logger.a.D;
            }
        }
    }

    public final boolean b() {
        try {
            AudioManager audioManager = this.a;
            if (audioManager != null) {
                audioManager.registerAudioDeviceCallback(this.b, null);
                return true;
            }
            return true;
        } catch (Exception e) {
            e.getLocalizedMessage();
            com.socure.idplus.device.internal.logger.a aVar = com.socure.idplus.device.internal.logger.a.D;
            return false;
        }
    }

    public final void c() {
        if (this.d) {
            try {
                if (this.a != null && this.b != null && d()) {
                    this.d = false;
                }
            } catch (Exception e) {
                e.getLocalizedMessage();
                com.socure.idplus.device.internal.logger.a aVar = com.socure.idplus.device.internal.logger.a.D;
            }
        }
    }

    public final boolean d() {
        try {
            AudioManager audioManager = this.a;
            if (audioManager != null) {
                audioManager.unregisterAudioDeviceCallback(this.b);
                return true;
            }
            return true;
        } catch (Exception e) {
            e.getLocalizedMessage();
            com.socure.idplus.device.internal.logger.a aVar = com.socure.idplus.device.internal.logger.a.D;
            return false;
        }
    }
}
