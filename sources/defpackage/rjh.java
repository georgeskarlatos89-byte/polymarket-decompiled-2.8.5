package defpackage;

import java.sql.Date;
import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.TimeZone;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class rjh extends wfj {
    public static final ml0 c = new ml0(4);
    public static final ml0 d = new ml0(5);
    public final /* synthetic */ int a;
    public final SimpleDateFormat b;

    public rjh(int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = new SimpleDateFormat("hh:mm:ss a");
                return;
            default:
                this.b = new SimpleDateFormat("MMM d, yyyy");
                return;
        }
    }

    @Override // defpackage.wfj
    public final Object b(ufa ufaVar) {
        TimeZone timeZone;
        Date date;
        Time time;
        switch (this.a) {
            case 0:
                if (ufaVar.R() == ega.NULL) {
                    ufaVar.G();
                    return null;
                }
                String nextString = ufaVar.nextString();
                synchronized (this) {
                    timeZone = this.b.getTimeZone();
                    try {
                        try {
                            date = new Date(this.b.parse(nextString).getTime());
                        } catch (ParseException e) {
                            throw new RuntimeException("Failed parsing '" + nextString + "' as SQL Date; at path " + ufaVar.p(true), e);
                        }
                    } finally {
                    }
                }
                return date;
            default:
                if (ufaVar.R() == ega.NULL) {
                    ufaVar.G();
                    return null;
                }
                String nextString2 = ufaVar.nextString();
                synchronized (this) {
                    timeZone = this.b.getTimeZone();
                    try {
                        try {
                            time = new Time(this.b.parse(nextString2).getTime());
                        } catch (ParseException e2) {
                            throw new RuntimeException("Failed parsing '" + nextString2 + "' as SQL Time; at path " + ufaVar.p(true), e2);
                        }
                    } finally {
                    }
                }
                return time;
        }
    }

    @Override // defpackage.wfj
    public final void c(xga xgaVar, Object obj) {
        String format;
        String format2;
        switch (this.a) {
            case 0:
                Date date = (Date) obj;
                if (date == null) {
                    xgaVar.y();
                    return;
                }
                synchronized (this) {
                    format = this.b.format((java.util.Date) date);
                }
                xgaVar.X(format);
                return;
            default:
                Time time = (Time) obj;
                if (time == null) {
                    xgaVar.y();
                    return;
                }
                synchronized (this) {
                    format2 = this.b.format((java.util.Date) time);
                }
                xgaVar.X(format2);
                return;
        }
    }
}
