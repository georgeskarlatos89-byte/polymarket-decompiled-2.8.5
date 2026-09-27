package org.webrtc.voiceengine;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.os.Process;
import defpackage.dmk;
import java.nio.ByteBuffer;
import org.webrtc.ContextUtils;
import org.webrtc.Logging;
import org.webrtc.ThreadUtils;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public class WebRtcAudioTrack {
    private static final long AUDIO_TRACK_THREAD_JOIN_TIMEOUT_MS = 2000;
    private static final int BITS_PER_SAMPLE = 16;
    private static final int BUFFERS_PER_SECOND = 100;
    private static final int CALLBACK_BUFFER_SIZE_MS = 10;
    private static final boolean DEBUG = false;
    private static final int DEFAULT_USAGE = 2;
    private static final String TAG = "WebRtcAudioTrack";
    private static ErrorCallback errorCallback = null;
    private static WebRtcAudioTrackErrorCallback errorCallbackOld = null;
    private static volatile boolean speakerMute = false;
    private static int usageAttribute = 2;
    private final AudioManager audioManager;
    private AudioTrackThread audioThread;
    private AudioTrack audioTrack;
    private ByteBuffer byteBuffer;
    private byte[] emptyBytes;
    private final long nativeAudioTrack;
    private final ThreadUtils.ThreadChecker threadChecker;

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    /* loaded from: classes6.dex */
    public enum AudioTrackStartErrorCode {
        AUDIO_TRACK_START_EXCEPTION,
        AUDIO_TRACK_START_STATE_MISMATCH
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    /* loaded from: classes6.dex */
    public class AudioTrackThread extends Thread {
        private volatile boolean keepAlive;

        public AudioTrackThread(String str) {
            super(str);
            this.keepAlive = true;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            boolean z;
            WebRtcAudioTrack webRtcAudioTrack;
            boolean z2;
            Process.setThreadPriority(-19);
            Logging.d(WebRtcAudioTrack.TAG, "AudioTrackThread" + WebRtcAudioUtils.getThreadInfo());
            if (WebRtcAudioTrack.a(WebRtcAudioTrack.this).getPlayState() == 3) {
                z = true;
            } else {
                z = false;
            }
            WebRtcAudioTrack.h(z);
            int capacity = WebRtcAudioTrack.b(WebRtcAudioTrack.this).capacity();
            while (true) {
                boolean z3 = this.keepAlive;
                webRtcAudioTrack = WebRtcAudioTrack.this;
                if (!z3) {
                    break;
                }
                WebRtcAudioTrack.e(webRtcAudioTrack, capacity, WebRtcAudioTrack.d(webRtcAudioTrack));
                if (capacity <= WebRtcAudioTrack.b(WebRtcAudioTrack.this).remaining()) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                WebRtcAudioTrack.h(z2);
                if (WebRtcAudioTrack.g()) {
                    WebRtcAudioTrack.b(WebRtcAudioTrack.this).clear();
                    WebRtcAudioTrack.b(WebRtcAudioTrack.this).put(WebRtcAudioTrack.c(WebRtcAudioTrack.this));
                    WebRtcAudioTrack.b(WebRtcAudioTrack.this).position(0);
                }
                int write = WebRtcAudioTrack.a(WebRtcAudioTrack.this).write(WebRtcAudioTrack.b(WebRtcAudioTrack.this), capacity, 0);
                if (write != capacity) {
                    Logging.e(WebRtcAudioTrack.TAG, "AudioTrack.write played invalid number of bytes: " + write);
                    if (write < 0) {
                        this.keepAlive = false;
                        WebRtcAudioTrack.f(WebRtcAudioTrack.this, "AudioTrack.write failed: " + write);
                    }
                }
                WebRtcAudioTrack.b(WebRtcAudioTrack.this).rewind();
            }
            if (WebRtcAudioTrack.a(webRtcAudioTrack) != null) {
                Logging.d(WebRtcAudioTrack.TAG, "Calling AudioTrack.stop...");
                try {
                    WebRtcAudioTrack.a(WebRtcAudioTrack.this).stop();
                    Logging.d(WebRtcAudioTrack.TAG, "AudioTrack.stop is done.");
                } catch (IllegalStateException e) {
                    Logging.e(WebRtcAudioTrack.TAG, "AudioTrack.stop failed: " + e.getMessage());
                }
            }
        }

        public void stopThread() {
            Logging.d(WebRtcAudioTrack.TAG, "stopThread");
            this.keepAlive = false;
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    /* loaded from: classes6.dex */
    public interface ErrorCallback {
        void onWebRtcAudioTrackError(String str);

        void onWebRtcAudioTrackInitError(String str);

        void onWebRtcAudioTrackStartError(AudioTrackStartErrorCode audioTrackStartErrorCode, String str);
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Deprecated
    /* loaded from: classes6.dex */
    public interface WebRtcAudioTrackErrorCallback {
        void onWebRtcAudioTrackError(String str);

        void onWebRtcAudioTrackInitError(String str);

        void onWebRtcAudioTrackStartError(String str);
    }

    public WebRtcAudioTrack(long j) {
        ThreadUtils.ThreadChecker threadChecker = new ThreadUtils.ThreadChecker();
        this.threadChecker = threadChecker;
        threadChecker.checkIsOnValidThread();
        Logging.d(TAG, "ctor" + WebRtcAudioUtils.getThreadInfo());
        this.nativeAudioTrack = j;
        this.audioManager = (AudioManager) ContextUtils.getApplicationContext().getSystemService("audio");
    }

    public static /* bridge */ /* synthetic */ AudioTrack a(WebRtcAudioTrack webRtcAudioTrack) {
        return webRtcAudioTrack.audioTrack;
    }

    private static void assertTrue(boolean z) {
        if (z) {
            return;
        }
        dmk.i("Expected condition to be true");
    }

    public static /* bridge */ /* synthetic */ ByteBuffer b(WebRtcAudioTrack webRtcAudioTrack) {
        return webRtcAudioTrack.byteBuffer;
    }

    public static /* bridge */ /* synthetic */ byte[] c(WebRtcAudioTrack webRtcAudioTrack) {
        return webRtcAudioTrack.emptyBytes;
    }

    private int channelCountToConfiguration(int i) {
        if (i == 1) {
            return 4;
        }
        return 12;
    }

    private static AudioTrack createAudioTrack(int i, int i2, int i3) {
        Logging.d(TAG, "createAudioTrack");
        int nativeOutputSampleRate = AudioTrack.getNativeOutputSampleRate(0);
        Logging.d(TAG, "nativeOutputSampleRate: " + nativeOutputSampleRate);
        if (i != nativeOutputSampleRate) {
            Logging.w(TAG, "Unable to use fast mode since requested sample rate is not native");
        }
        if (usageAttribute != 2) {
            Logging.w(TAG, "A non default usage attribute is used: " + usageAttribute);
        }
        return new AudioTrack(new AudioAttributes.Builder().setUsage(usageAttribute).setContentType(1).build(), new AudioFormat.Builder().setEncoding(2).setSampleRate(i).setChannelMask(i2).build(), i3, 1, 0);
    }

    public static /* bridge */ /* synthetic */ long d(WebRtcAudioTrack webRtcAudioTrack) {
        return webRtcAudioTrack.nativeAudioTrack;
    }

    public static /* bridge */ /* synthetic */ void e(WebRtcAudioTrack webRtcAudioTrack, int i, long j) {
        webRtcAudioTrack.nativeGetPlayoutData(i, j);
    }

    public static /* bridge */ /* synthetic */ void f(WebRtcAudioTrack webRtcAudioTrack, String str) {
        webRtcAudioTrack.reportWebRtcAudioTrackError(str);
    }

    public static /* bridge */ /* synthetic */ boolean g() {
        return speakerMute;
    }

    private int getBufferSizeInFrames() {
        return this.audioTrack.getBufferSizeInFrames();
    }

    private int getStreamMaxVolume() {
        boolean z;
        this.threadChecker.checkIsOnValidThread();
        Logging.d(TAG, "getStreamMaxVolume");
        if (this.audioManager != null) {
            z = true;
        } else {
            z = false;
        }
        assertTrue(z);
        return this.audioManager.getStreamMaxVolume(0);
    }

    private int getStreamVolume() {
        boolean z;
        this.threadChecker.checkIsOnValidThread();
        Logging.d(TAG, "getStreamVolume");
        if (this.audioManager != null) {
            z = true;
        } else {
            z = false;
        }
        assertTrue(z);
        return this.audioManager.getStreamVolume(0);
    }

    public static /* bridge */ /* synthetic */ void h(boolean z) {
        assertTrue(z);
    }

    private int initPlayout(int i, int i2, double d) {
        this.threadChecker.checkIsOnValidThread();
        Logging.d(TAG, "initPlayout(sampleRate=" + i + ", channels=" + i2 + ", bufferSizeFactor=" + d + ")");
        this.byteBuffer = ByteBuffer.allocateDirect((i / 100) * i2 * 2);
        StringBuilder sb = new StringBuilder("byteBuffer.capacity: ");
        sb.append(this.byteBuffer.capacity());
        Logging.d(TAG, sb.toString());
        this.emptyBytes = new byte[this.byteBuffer.capacity()];
        nativeCacheDirectBufferAddress(this.byteBuffer, this.nativeAudioTrack);
        int channelCountToConfiguration = channelCountToConfiguration(i2);
        int minBufferSize = (int) (AudioTrack.getMinBufferSize(i, channelCountToConfiguration, 2) * d);
        Logging.d(TAG, "minBufferSizeInBytes: " + minBufferSize);
        if (minBufferSize < this.byteBuffer.capacity()) {
            reportWebRtcAudioTrackInitError("AudioTrack.getMinBufferSize returns an invalid value.");
            return -1;
        }
        if (this.audioTrack != null) {
            reportWebRtcAudioTrackInitError("Conflict with existing AudioTrack.");
            return -1;
        }
        try {
            AudioTrack createAudioTrack = createAudioTrack(i, channelCountToConfiguration, minBufferSize);
            this.audioTrack = createAudioTrack;
            if (createAudioTrack != null && createAudioTrack.getState() == 1) {
                logMainParameters();
                logMainParametersExtended();
                return minBufferSize;
            }
            reportWebRtcAudioTrackInitError("Initialization of audio track failed.");
            releaseAudioResources();
            return -1;
        } catch (IllegalArgumentException e) {
            reportWebRtcAudioTrackInitError(e.getMessage());
            releaseAudioResources();
            return -1;
        }
    }

    private void logBufferCapacityInFrames() {
        Logging.d(TAG, "AudioTrack: buffer capacity in frames: " + this.audioTrack.getBufferCapacityInFrames());
    }

    private void logBufferSizeInFrames() {
        Logging.d(TAG, "AudioTrack: buffer size in frames: " + this.audioTrack.getBufferSizeInFrames());
    }

    private void logMainParameters() {
        Logging.d(TAG, "AudioTrack: session ID: " + this.audioTrack.getAudioSessionId() + ", channels: " + this.audioTrack.getChannelCount() + ", sample rate: " + this.audioTrack.getSampleRate() + ", max gain: " + AudioTrack.getMaxVolume());
    }

    private void logMainParametersExtended() {
        logBufferSizeInFrames();
        logBufferCapacityInFrames();
    }

    private void logUnderrunCount() {
        Logging.d(TAG, "underrun count: " + this.audioTrack.getUnderrunCount());
    }

    private native void nativeCacheDirectBufferAddress(ByteBuffer byteBuffer, long j);

    private native void nativeGetPlayoutData(int i, long j);

    private void releaseAudioResources() {
        Logging.d(TAG, "releaseAudioResources");
        AudioTrack audioTrack = this.audioTrack;
        if (audioTrack != null) {
            audioTrack.release();
            this.audioTrack = null;
        }
    }

    private void reportWebRtcAudioTrackError(String str) {
        Logging.e(TAG, "Run-time playback error: " + str);
        WebRtcAudioUtils.logAudioState(TAG);
        WebRtcAudioTrackErrorCallback webRtcAudioTrackErrorCallback = errorCallbackOld;
        if (webRtcAudioTrackErrorCallback != null) {
            webRtcAudioTrackErrorCallback.onWebRtcAudioTrackError(str);
        }
        ErrorCallback errorCallback2 = errorCallback;
        if (errorCallback2 != null) {
            errorCallback2.onWebRtcAudioTrackError(str);
        }
    }

    private void reportWebRtcAudioTrackInitError(String str) {
        Logging.e(TAG, "Init playout error: " + str);
        WebRtcAudioUtils.logAudioState(TAG);
        WebRtcAudioTrackErrorCallback webRtcAudioTrackErrorCallback = errorCallbackOld;
        if (webRtcAudioTrackErrorCallback != null) {
            webRtcAudioTrackErrorCallback.onWebRtcAudioTrackInitError(str);
        }
        ErrorCallback errorCallback2 = errorCallback;
        if (errorCallback2 != null) {
            errorCallback2.onWebRtcAudioTrackInitError(str);
        }
    }

    private void reportWebRtcAudioTrackStartError(AudioTrackStartErrorCode audioTrackStartErrorCode, String str) {
        Logging.e(TAG, "Start playout error: " + audioTrackStartErrorCode + ". " + str);
        WebRtcAudioUtils.logAudioState(TAG);
        WebRtcAudioTrackErrorCallback webRtcAudioTrackErrorCallback = errorCallbackOld;
        if (webRtcAudioTrackErrorCallback != null) {
            webRtcAudioTrackErrorCallback.onWebRtcAudioTrackStartError(str);
        }
        ErrorCallback errorCallback2 = errorCallback;
        if (errorCallback2 != null) {
            errorCallback2.onWebRtcAudioTrackStartError(audioTrackStartErrorCode, str);
        }
    }

    public static synchronized void setAudioTrackUsageAttribute(int i) {
        synchronized (WebRtcAudioTrack.class) {
            Logging.w(TAG, "Default usage attribute is changed from: 2 to " + i);
            usageAttribute = i;
        }
    }

    @Deprecated
    public static void setErrorCallback(WebRtcAudioTrackErrorCallback webRtcAudioTrackErrorCallback) {
        Logging.d(TAG, "Set error callback (deprecated");
        errorCallbackOld = webRtcAudioTrackErrorCallback;
    }

    public static void setSpeakerMute(boolean z) {
        Logging.w(TAG, "setSpeakerMute(" + z + ")");
        speakerMute = z;
    }

    private boolean setStreamVolume(int i) {
        boolean z;
        this.threadChecker.checkIsOnValidThread();
        Logging.d(TAG, "setStreamVolume(" + i + ")");
        if (this.audioManager != null) {
            z = true;
        } else {
            z = false;
        }
        assertTrue(z);
        if (this.audioManager.isVolumeFixed()) {
            Logging.e(TAG, "The device implements a fixed volume policy.");
            return false;
        }
        this.audioManager.setStreamVolume(0, i, 0);
        return true;
    }

    private boolean startPlayout() {
        boolean z;
        boolean z2;
        this.threadChecker.checkIsOnValidThread();
        Logging.d(TAG, "startPlayout");
        if (this.audioTrack != null) {
            z = true;
        } else {
            z = false;
        }
        assertTrue(z);
        if (this.audioThread == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        assertTrue(z2);
        try {
            this.audioTrack.play();
            if (this.audioTrack.getPlayState() != 3) {
                reportWebRtcAudioTrackStartError(AudioTrackStartErrorCode.AUDIO_TRACK_START_STATE_MISMATCH, "AudioTrack.play failed - incorrect state :" + this.audioTrack.getPlayState());
                releaseAudioResources();
                return false;
            }
            AudioTrackThread audioTrackThread = new AudioTrackThread("AudioTrackJavaThread");
            this.audioThread = audioTrackThread;
            audioTrackThread.start();
            return true;
        } catch (IllegalStateException e) {
            reportWebRtcAudioTrackStartError(AudioTrackStartErrorCode.AUDIO_TRACK_START_EXCEPTION, "AudioTrack.play failed: " + e.getMessage());
            releaseAudioResources();
            return false;
        }
    }

    private boolean stopPlayout() {
        boolean z;
        this.threadChecker.checkIsOnValidThread();
        Logging.d(TAG, "stopPlayout");
        if (this.audioThread != null) {
            z = true;
        } else {
            z = false;
        }
        assertTrue(z);
        logUnderrunCount();
        this.audioThread.stopThread();
        Logging.d(TAG, "Stopping the AudioTrackThread...");
        this.audioThread.interrupt();
        if (!ThreadUtils.joinUninterruptibly(this.audioThread, 2000L)) {
            Logging.e(TAG, "Join of AudioTrackThread timed out.");
            WebRtcAudioUtils.logAudioState(TAG);
        }
        Logging.d(TAG, "AudioTrackThread has now been stopped.");
        this.audioThread = null;
        releaseAudioResources();
        return true;
    }

    public static void setErrorCallback(ErrorCallback errorCallback2) {
        Logging.d(TAG, "Set extended error callback");
        errorCallback = errorCallback2;
    }
}
