package defpackage;

import android.content.Context;
import android.media.metrics.PlaybackMetrics;
import android.media.metrics.PlaybackSession;
import android.media.metrics.TrackChangeEvent;
import android.os.SystemClock;
import android.util.Pair;
import java.util.HashMap;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class o7c {
    public int A;
    public boolean B;
    public final Context a;
    public final ub6 c;
    public final PlaybackSession d;
    public String j;
    public PlaybackMetrics.Builder k;
    public int l;
    public rpe o;
    public vt1 p;
    public vt1 q;
    public vt1 r;
    public el8 s;
    public el8 t;
    public el8 u;
    public boolean v;
    public int w;
    public boolean x;
    public int y;
    public int z;
    public final Executor b = h31.b();
    public final o2j f = new o2j();
    public final n2j g = new n2j();
    public final HashMap i = new HashMap();
    public final HashMap h = new HashMap();
    public final long e = SystemClock.elapsedRealtime();
    public int m = 0;
    public int n = 0;

    public o7c(Context context, PlaybackSession playbackSession) {
        this.a = context.getApplicationContext();
        this.d = playbackSession;
        ub6 ub6Var = new ub6();
        this.c = ub6Var;
        ub6Var.d = this;
    }

    public final boolean a(vt1 vt1Var) {
        String str;
        if (vt1Var != null) {
            String str2 = (String) vt1Var.d;
            ub6 ub6Var = this.c;
            synchronized (ub6Var) {
                str = ub6Var.f;
            }
            if (str2.equals(str)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void b() {
        long longValue;
        long longValue2;
        int i;
        PlaybackMetrics.Builder builder = this.k;
        if (builder != null && this.B) {
            builder.setAudioUnderrunCount(this.A);
            this.k.setVideoFramesDropped(this.y);
            this.k.setVideoFramesPlayed(this.z);
            Long l = (Long) this.h.get(this.j);
            PlaybackMetrics.Builder builder2 = this.k;
            if (l == null) {
                longValue = 0;
            } else {
                longValue = l.longValue();
            }
            builder2.setNetworkTransferDurationMillis(longValue);
            Long l2 = (Long) this.i.get(this.j);
            PlaybackMetrics.Builder builder3 = this.k;
            if (l2 == null) {
                longValue2 = 0;
            } else {
                longValue2 = l2.longValue();
            }
            builder3.setNetworkBytesRead(longValue2);
            PlaybackMetrics.Builder builder4 = this.k;
            if (l2 != null && l2.longValue() > 0) {
                i = 1;
            } else {
                i = 0;
            }
            builder4.setStreamSource(i);
            this.b.execute(new vq8(18, this, this.k.build()));
        }
        this.k = null;
        this.j = null;
        this.A = 0;
        this.y = 0;
        this.z = 0;
        this.s = null;
        this.t = null;
        this.u = null;
        this.B = false;
    }

    public final void c(v2j v2jVar, x7c x7cVar) {
        int b;
        PlaybackMetrics.Builder builder = this.k;
        if (x7cVar == null || (b = v2jVar.b(x7cVar.a)) == -1) {
            return;
        }
        n2j n2jVar = this.g;
        int i = 0;
        v2jVar.f(b, n2jVar, false);
        int i2 = n2jVar.c;
        o2j o2jVar = this.f;
        v2jVar.n(i2, o2jVar);
        g7c g7cVar = o2jVar.c.b;
        int i3 = 2;
        if (g7cVar != null) {
            int E = u1k.E(g7cVar.a, g7cVar.b);
            if (E != 0) {
                if (E != 1) {
                    if (E != 2) {
                        i = 1;
                    } else {
                        i = 4;
                    }
                } else {
                    i = 5;
                }
            } else {
                i = 3;
            }
        }
        builder.setStreamType(i);
        if (o2jVar.m != -9223372036854775807L && !o2jVar.k && !o2jVar.i && !o2jVar.a()) {
            builder.setMediaDurationMillis(u1k.W(o2jVar.m));
        }
        if (!o2jVar.a()) {
            i3 = 1;
        }
        builder.setPlaybackType(i3);
        this.B = true;
    }

    public final void d(lp lpVar, String str) {
        x7c x7cVar = lpVar.d;
        if ((x7cVar == null || !x7cVar.b()) && str.equals(this.j)) {
            b();
        }
        this.h.remove(str);
        this.i.remove(str);
    }

    public final void e(int i, long j, el8 el8Var, int i2) {
        int i3;
        String str;
        TrackChangeEvent.Builder timeSinceCreatedMillis = new TrackChangeEvent.Builder(i).setTimeSinceCreatedMillis(j - this.e);
        if (el8Var != null) {
            timeSinceCreatedMillis.setTrackState(1);
            if (i2 != 1) {
                i3 = 3;
                if (i2 != 2) {
                    if (i2 != 3) {
                        i3 = 1;
                    } else {
                        i3 = 4;
                    }
                }
            } else {
                i3 = 2;
            }
            timeSinceCreatedMillis.setTrackChangeReason(i3);
            String str2 = el8Var.m;
            if (str2 != null) {
                timeSinceCreatedMillis.setContainerMimeType(str2);
            }
            String str3 = el8Var.n;
            if (str3 != null) {
                timeSinceCreatedMillis.setSampleMimeType(str3);
            }
            String str4 = el8Var.k;
            if (str4 != null) {
                timeSinceCreatedMillis.setCodecName(str4);
            }
            int i4 = el8Var.j;
            if (i4 != -1) {
                timeSinceCreatedMillis.setBitrate(i4);
            }
            int i5 = el8Var.u;
            if (i5 != -1) {
                timeSinceCreatedMillis.setWidth(i5);
            }
            int i6 = el8Var.v;
            if (i6 != -1) {
                timeSinceCreatedMillis.setHeight(i6);
            }
            int i7 = el8Var.D;
            if (i7 != -1) {
                timeSinceCreatedMillis.setChannelCount(i7);
            }
            int i8 = el8Var.E;
            if (i8 != -1) {
                timeSinceCreatedMillis.setAudioSampleRate(i8);
            }
            String str5 = el8Var.d;
            if (str5 != null) {
                int i9 = u1k.a;
                String[] split = str5.split("-", -1);
                String str6 = split[0];
                if (split.length >= 2) {
                    str = split[1];
                } else {
                    str = null;
                }
                Pair create = Pair.create(str6, str);
                timeSinceCreatedMillis.setLanguage((String) create.first);
                Object obj = create.second;
                if (obj != null) {
                    timeSinceCreatedMillis.setLanguageRegion((String) obj);
                }
            }
            float f = el8Var.w;
            if (f != -1.0f) {
                timeSinceCreatedMillis.setVideoFrameRate(f);
            }
        } else {
            timeSinceCreatedMillis.setTrackState(0);
        }
        this.B = true;
        this.b.execute(new vq8(15, this, timeSinceCreatedMillis.build()));
    }
}
