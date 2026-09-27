package org.webrtc.audio;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.os.Process;
import defpackage.ace;
import defpackage.dmk;
import java.nio.ByteBuffer;
import org.webrtc.Logging;
import org.webrtc.ThreadUtils;
import org.webrtc.audio.JavaAudioDeviceModule;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
class WebRtcAudioTrack {
    private static final int AUDIO_TRACK_START = 0;
    private static final int AUDIO_TRACK_STOP = 1;
    private static final long AUDIO_TRACK_THREAD_JOIN_TIMEOUT_MS = 2000;
    private static final int BITS_PER_SAMPLE = 16;
    private static final int BUFFERS_PER_SECOND = 100;
    private static final int CALLBACK_BUFFER_SIZE_MS = 10;
    private static final int DEFAULT_USAGE = 2;
    private static final String TAG = "WebRtcAudioTrackExternal";
    public AudioAttributes audioAttributes;
    private final AudioManager audioManager;
    private AudioTrackThread audioThread;
    private AudioTrack audioTrack;
    private ByteBuffer byteBuffer;
    private final Context context;
    private byte[] emptyBytes;
    private final JavaAudioDeviceModule.AudioTrackErrorCallback errorCallback;
    private int initialBufferSizeInFrames;
    private long nativeAudioTrack;
    private volatile boolean speakerMute;
    private final JavaAudioDeviceModule.AudioTrackStateCallback stateCallback;
    private final ThreadUtils.ThreadChecker threadChecker;
    private boolean useLowLatency;
    private final VolumeLogger volumeLogger;

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    /* loaded from: classes6.dex */
    public class AudioTrackThread extends Thread {
        private LowLatencyAudioBufferManager bufferManager;
        private volatile boolean keepAlive;

        public AudioTrackThread(String str) {
            super(str);
            this.keepAlive = true;
            this.bufferManager = new LowLatencyAudioBufferManager();
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            boolean z;
            boolean z2;
            Process.setThreadPriority(-19);
            Logging.d(WebRtcAudioTrack.TAG, "AudioTrackThread" + WebRtcAudioUtils.getThreadInfo());
            if (WebRtcAudioTrack.a(WebRtcAudioTrack.this).getPlayState() == 3) {
                z = true;
            } else {
                z = false;
            }
            WebRtcAudioTrack.i(z);
            WebRtcAudioTrack.g(WebRtcAudioTrack.this);
            int capacity = WebRtcAudioTrack.b(WebRtcAudioTrack.this).capacity();
            while (this.keepAlive) {
                WebRtcAudioTrack.j(capacity, WebRtcAudioTrack.d(WebRtcAudioTrack.this));
                if (capacity <= WebRtcAudioTrack.b(WebRtcAudioTrack.this).remaining()) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                WebRtcAudioTrack.i(z2);
                if (WebRtcAudioTrack.e(WebRtcAudioTrack.this)) {
                    WebRtcAudioTrack.b(WebRtcAudioTrack.this).clear();
                    WebRtcAudioTrack.b(WebRtcAudioTrack.this).put(WebRtcAudioTrack.c(WebRtcAudioTrack.this));
                    WebRtcAudioTrack.b(WebRtcAudioTrack.this).position(0);
                }
                int write = WebRtcAudioTrack.a(WebRtcAudioTrack.this).write(WebRtcAudioTrack.b(WebRtcAudioTrack.this), capacity, 0);
                if (write != capacity) {
                    Logging.e(WebRtcAudioTrack.TAG, "AudioTrack.write played invalid number of bytes: " + write);
                    if (write < 0) {
                        this.keepAlive = false;
                        WebRtcAudioTrack.h(WebRtcAudioTrack.this, ace.f(write, "AudioTrack.write failed: "));
                    }
                }
                if (WebRtcAudioTrack.f(WebRtcAudioTrack.this)) {
                    this.bufferManager.maybeAdjustBufferSize(WebRtcAudioTrack.a(WebRtcAudioTrack.this));
                }
                WebRtcAudioTrack.b(WebRtcAudioTrack.this).rewind();
            }
        }

        public void stopThread() {
            Logging.d(WebRtcAudioTrack.TAG, "stopThread");
            this.keepAlive = false;
        }
    }

    public WebRtcAudioTrack(Context context, AudioManager audioManager, AudioAttributes audioAttributes, JavaAudioDeviceModule.AudioTrackErrorCallback audioTrackErrorCallback, JavaAudioDeviceModule.AudioTrackStateCallback audioTrackStateCallback, boolean z, boolean z2) {
        VolumeLogger volumeLogger;
        ThreadUtils.ThreadChecker threadChecker = new ThreadUtils.ThreadChecker();
        this.threadChecker = threadChecker;
        threadChecker.detachThread();
        this.context = context;
        this.audioManager = audioManager;
        this.audioAttributes = audioAttributes;
        this.errorCallback = audioTrackErrorCallback;
        this.stateCallback = audioTrackStateCallback;
        if (z2) {
            volumeLogger = new VolumeLogger(audioManager);
        } else {
            volumeLogger = null;
        }
        this.volumeLogger = volumeLogger;
        this.useLowLatency = z;
        Logging.d(TAG, "ctor" + WebRtcAudioUtils.getThreadInfo());
    }

    private int GetPlayoutUnderrunCount() {
        AudioTrack audioTrack = this.audioTrack;
        if (audioTrack != null) {
            return audioTrack.getUnderrunCount();
        }
        return -1;
    }

    public static /* bridge */ /* synthetic */ AudioTrack a(WebRtcAudioTrack webRtcAudioTrack) {
        return webRtcAudioTrack.audioTrack;
    }

    private static AudioAttributes.Builder applyAttributesOnQOrHigher(AudioAttributes.Builder builder, AudioAttributes audioAttributes) {
        return builder.setAllowedCapturePolicy(audioAttributes.getAllowedCapturePolicy());
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

    private static AudioTrack createAudioTrackBeforeOreo(int i, int i2, int i3, AudioAttributes audioAttributes) {
        Logging.d(TAG, "createAudioTrackBeforeOreo");
        logNativeOutputSampleRate(i);
        return new AudioTrack(getAudioAttributes(audioAttributes), new AudioFormat.Builder().setEncoding(2).setSampleRate(i).setChannelMask(i2).build(), i3, 1, 0);
    }

    private static AudioTrack createAudioTrackOnOreoOrHigher(int i, int i2, int i3, AudioAttributes audioAttributes) {
        Logging.d(TAG, "createAudioTrackOnOreoOrHigher");
        logNativeOutputSampleRate(i);
        return new AudioTrack.Builder().setAudioAttributes(getAudioAttributes(audioAttributes)).setAudioFormat(new AudioFormat.Builder().setEncoding(2).setSampleRate(i).setChannelMask(i2).build()).setBufferSizeInBytes(i3).setPerformanceMode(1).setTransferMode(1).setSessionId(0).build();
    }

    public static /* bridge */ /* synthetic */ long d(WebRtcAudioTrack webRtcAudioTrack) {
        return webRtcAudioTrack.nativeAudioTrack;
    }

    private void doAudioTrackStateCallback(int i) {
        Logging.d(TAG, "doAudioTrackStateCallback: " + i);
        JavaAudioDeviceModule.AudioTrackStateCallback audioTrackStateCallback = this.stateCallback;
        if (audioTrackStateCallback != null) {
            if (i == 0) {
                audioTrackStateCallback.onWebRtcAudioTrackStart();
            } else if (i == 1) {
                audioTrackStateCallback.onWebRtcAudioTrackStop();
            } else {
                Logging.e(TAG, "Invalid audio state");
            }
        }
    }

    public static /* bridge */ /* synthetic */ boolean e(WebRtcAudioTrack webRtcAudioTrack) {
        return webRtcAudioTrack.speakerMute;
    }

    public static /* bridge */ /* synthetic */ boolean f(WebRtcAudioTrack webRtcAudioTrack) {
        return webRtcAudioTrack.useLowLatency;
    }

    public static /* bridge */ /* synthetic */ void g(WebRtcAudioTrack webRtcAudioTrack) {
        webRtcAudioTrack.doAudioTrackStateCallback(0);
    }

    private static AudioAttributes getAudioAttributes(AudioAttributes audioAttributes) {
        AudioAttributes.Builder contentType = new AudioAttributes.Builder().setUsage(2).setContentType(1);
        if (audioAttributes != null) {
            if (audioAttributes.getUsage() != 0) {
                contentType.setUsage(audioAttributes.getUsage());
            }
            if (audioAttributes.getContentType() != 0) {
                contentType.setContentType(audioAttributes.getContentType());
            }
            contentType.setFlags(audioAttributes.getFlags());
            contentType = applyAttributesOnQOrHigher(contentType, audioAttributes);
        }
        return contentType.build();
    }

    private int getBufferSizeInFrames() {
        return this.audioTrack.getBufferSizeInFrames();
    }

    private int getInitialBufferSizeInFrames() {
        return this.initialBufferSizeInFrames;
    }

    private int getStreamMaxVolume() {
        this.threadChecker.checkIsOnValidThread();
        Logging.d(TAG, "getStreamMaxVolume");
        return this.audioManager.getStreamMaxVolume(0);
    }

    private int getStreamVolume() {
        this.threadChecker.checkIsOnValidThread();
        Logging.d(TAG, "getStreamVolume");
        return this.audioManager.getStreamVolume(0);
    }

    public static /* bridge */ /* synthetic */ void h(WebRtcAudioTrack webRtcAudioTrack, String str) {
        webRtcAudioTrack.reportWebRtcAudioTrackError(str);
    }

    public static /* bridge */ /* synthetic */ void i(boolean z) {
        assertTrue(z);
    }

    private int initPlayout(int i, int i2, double d) {
        AudioTrack createAudioTrackBeforeOreo;
        this.threadChecker.checkIsOnValidThread();
        Logging.d(TAG, "initPlayout(sampleRate=" + i + ", channels=" + i2 + ", bufferSizeFactor=" + d + ")");
        this.byteBuffer = ByteBuffer.allocateDirect((i / 100) * i2 * 2);
        StringBuilder sb = new StringBuilder("byteBuffer.capacity: ");
        sb.append(this.byteBuffer.capacity());
        Logging.d(TAG, sb.toString());
        this.emptyBytes = new byte[this.byteBuffer.capacity()];
        nativeCacheDirectBufferAddress(this.nativeAudioTrack, this.byteBuffer);
        int channelCountToConfiguration = channelCountToConfiguration(i2);
        int minBufferSize = (int) (AudioTrack.getMinBufferSize(i, channelCountToConfiguration, 2) * d);
        Logging.d(TAG, "minBufferSizeInBytes: " + minBufferSize);
        if (minBufferSize < this.byteBuffer.capacity()) {
            reportWebRtcAudioTrackInitError("AudioTrack.getMinBufferSize returns an invalid value.");
            return -1;
        }
        if (d > 1.0d) {
            this.useLowLatency = false;
        }
        if (this.audioTrack != null) {
            reportWebRtcAudioTrackInitError("Conflict with existing AudioTrack.");
            return -1;
        }
        try {
            boolean z = this.useLowLatency;
            AudioAttributes audioAttributes = this.audioAttributes;
            if (z) {
                createAudioTrackBeforeOreo = createAudioTrackOnOreoOrHigher(i, channelCountToConfiguration, minBufferSize, audioAttributes);
                this.audioTrack = createAudioTrackBeforeOreo;
            } else {
                createAudioTrackBeforeOreo = createAudioTrackBeforeOreo(i, channelCountToConfiguration, minBufferSize, audioAttributes);
                this.audioTrack = createAudioTrackBeforeOreo;
            }
            if (createAudioTrackBeforeOreo != null && createAudioTrackBeforeOreo.getState() == 1) {
                this.initialBufferSizeInFrames = this.audioTrack.getBufferSizeInFrames();
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

    public static /* bridge */ /* synthetic */ void j(int i, long j) {
        nativeGetPlayoutData(j, i);
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

    private static void logNativeOutputSampleRate(int i) {
        int nativeOutputSampleRate = AudioTrack.getNativeOutputSampleRate(0);
        Logging.d(TAG, "nativeOutputSampleRate: " + nativeOutputSampleRate);
        if (i != nativeOutputSampleRate) {
            Logging.w(TAG, "Unable to use fast mode since requested sample rate is not native");
        }
    }

    private void logUnderrunCount() {
        Logging.d(TAG, "underrun count: " + this.audioTrack.getUnderrunCount());
    }

    private static native void nativeCacheDirectBufferAddress(long j, ByteBuffer byteBuffer);

    private static native void nativeGetPlayoutData(long j, int i);

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
        WebRtcAudioUtils.logAudioState(TAG, this.context, this.audioManager);
        JavaAudioDeviceModule.AudioTrackErrorCallback audioTrackErrorCallback = this.errorCallback;
        if (audioTrackErrorCallback != null) {
            audioTrackErrorCallback.onWebRtcAudioTrackError(str);
        }
    }

    private void reportWebRtcAudioTrackInitError(String str) {
        Logging.e(TAG, "Init playout error: " + str);
        WebRtcAudioUtils.logAudioState(TAG, this.context, this.audioManager);
        JavaAudioDeviceModule.AudioTrackErrorCallback audioTrackErrorCallback = this.errorCallback;
        if (audioTrackErrorCallback != null) {
            audioTrackErrorCallback.onWebRtcAudioTrackInitError(str);
        }
    }

    private void reportWebRtcAudioTrackStartError(JavaAudioDeviceModule.AudioTrackStartErrorCode audioTrackStartErrorCode, String str) {
        Logging.e(TAG, "Start playout error: " + audioTrackStartErrorCode + ". " + str);
        WebRtcAudioUtils.logAudioState(TAG, this.context, this.audioManager);
        JavaAudioDeviceModule.AudioTrackErrorCallback audioTrackErrorCallback = this.errorCallback;
        if (audioTrackErrorCallback != null) {
            audioTrackErrorCallback.onWebRtcAudioTrackStartError(audioTrackStartErrorCode, str);
        }
    }

    private boolean setStreamVolume(int i) {
        this.threadChecker.checkIsOnValidThread();
        Logging.d(TAG, "setStreamVolume(" + i + ")");
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
        VolumeLogger volumeLogger = this.volumeLogger;
        if (volumeLogger != null) {
            volumeLogger.start();
        }
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
                reportWebRtcAudioTrackStartError(JavaAudioDeviceModule.AudioTrackStartErrorCode.AUDIO_TRACK_START_STATE_MISMATCH, "AudioTrack.play failed - incorrect state :" + this.audioTrack.getPlayState());
                releaseAudioResources();
                return false;
            }
            AudioTrackThread audioTrackThread = new AudioTrackThread("AudioTrackJavaThread");
            this.audioThread = audioTrackThread;
            audioTrackThread.start();
            return true;
        } catch (IllegalStateException e) {
            reportWebRtcAudioTrackStartError(JavaAudioDeviceModule.AudioTrackStartErrorCode.AUDIO_TRACK_START_EXCEPTION, "AudioTrack.play failed: " + e.getMessage());
            releaseAudioResources();
            return false;
        }
    }

    private boolean stopPlayout() {
        boolean z;
        this.threadChecker.checkIsOnValidThread();
        VolumeLogger volumeLogger = this.volumeLogger;
        if (volumeLogger != null) {
            volumeLogger.stop();
        }
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
            WebRtcAudioUtils.logAudioState(TAG, this.context, this.audioManager);
        }
        Logging.d(TAG, "AudioTrackThread has now been stopped.");
        this.audioThread = null;
        if (this.audioTrack != null) {
            Logging.d(TAG, "Calling AudioTrack.stop...");
            try {
                this.audioTrack.stop();
                Logging.d(TAG, "AudioTrack.stop is done.");
                doAudioTrackStateCallback(1);
            } catch (IllegalStateException e) {
                Logging.e(TAG, "AudioTrack.stop failed: " + e.getMessage());
            }
        }
        releaseAudioResources();
        return true;
    }

    public void setNativeAudioTrack(long j) {
        this.nativeAudioTrack = j;
    }

    public void setSpeakerMute(boolean z) {
        Logging.w(TAG, "setSpeakerMute(" + z + ")");
        this.speakerMute = z;
    }

    public WebRtcAudioTrack(Context context, AudioManager audioManager) {
        this(context, audioManager, null, null, null, false, true);
    }
}
