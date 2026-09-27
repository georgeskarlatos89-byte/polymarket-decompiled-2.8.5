package org.webrtc.audio;

import android.media.AudioManager;
import io.intercom.android.sdk.metrics.ops.OpsMetricTracker;
import java.util.Timer;
import java.util.TimerTask;
import org.webrtc.Logging;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
class VolumeLogger {
    private static final String TAG = "VolumeLogger";
    private static final String THREAD_NAME = "WebRtcVolumeLevelLoggerThread";
    private static final int TIMER_PERIOD_IN_SECONDS = 30;
    private final AudioManager audioManager;
    private Timer timer;

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    /* loaded from: classes6.dex */
    public class LogVolumeTask extends TimerTask {
        private final int maxRingVolume;
        private final int maxVoiceCallVolume;

        public LogVolumeTask(int i, int i2) {
            this.maxRingVolume = i;
            this.maxVoiceCallVolume = i2;
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            int mode = VolumeLogger.a(VolumeLogger.this).getMode();
            if (mode == 1) {
                Logging.d(VolumeLogger.TAG, "STREAM_RING stream volume: " + VolumeLogger.a(VolumeLogger.this).getStreamVolume(2) + " (max=" + this.maxRingVolume + ")");
                return;
            }
            if (mode == 3) {
                Logging.d(VolumeLogger.TAG, "VOICE_CALL stream volume: " + VolumeLogger.a(VolumeLogger.this).getStreamVolume(0) + " (max=" + this.maxVoiceCallVolume + ")");
            }
        }
    }

    public VolumeLogger(AudioManager audioManager) {
        this.audioManager = audioManager;
    }

    public static /* bridge */ /* synthetic */ AudioManager a(VolumeLogger volumeLogger) {
        return volumeLogger.audioManager;
    }

    public void start() {
        Logging.d(TAG, OpsMetricTracker.START + WebRtcAudioUtils.getThreadInfo());
        if (this.timer != null) {
            return;
        }
        Logging.d(TAG, "audio mode is: " + WebRtcAudioUtils.modeToString(this.audioManager.getMode()));
        Timer timer = new Timer(THREAD_NAME);
        this.timer = timer;
        timer.schedule(new LogVolumeTask(this.audioManager.getStreamMaxVolume(2), this.audioManager.getStreamMaxVolume(0)), 0L, 30000L);
    }

    public void stop() {
        Logging.d(TAG, "stop" + WebRtcAudioUtils.getThreadInfo());
        Timer timer = this.timer;
        if (timer != null) {
            timer.cancel();
            this.timer = null;
        }
    }
}
