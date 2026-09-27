package kotlin.text;

import defpackage.lnf;
import defpackage.p3;
import defpackage.r3c;
import java.util.List;
import java.util.regex.Matcher;
import kotlin.ranges.IntRange;
import kotlin.text.MatchResult;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class b implements MatchResult {
    public final Matcher a;
    public final CharSequence b;
    public final p3 c;
    public r3c d;

    public b(Matcher matcher, CharSequence charSequence) {
        matcher.getClass();
        charSequence.getClass();
        this.a = matcher;
        this.b = charSequence;
        this.c = new p3(this, 1);
    }

    @Override // kotlin.text.MatchResult
    public final IntRange a() {
        Matcher matcher = this.a;
        return lnf.k(matcher.start(), matcher.end());
    }

    @Override // kotlin.text.MatchResult
    public final p3 b() {
        return this.c;
    }

    @Override // kotlin.text.MatchResult
    public final MatchResult.Destructured getDestructured() {
        return new MatchResult.Destructured(this);
    }

    @Override // kotlin.text.MatchResult
    public final List getGroupValues() {
        r3c r3cVar = this.d;
        if (r3cVar == null) {
            r3c r3cVar2 = new r3c(this);
            this.d = r3cVar2;
            return r3cVar2;
        }
        return r3cVar;
    }

    @Override // kotlin.text.MatchResult
    public final String getValue() {
        String group = this.a.group();
        group.getClass();
        return group;
    }

    @Override // kotlin.text.MatchResult
    public final b next() {
        int i;
        Matcher matcher = this.a;
        int end = matcher.end();
        if (matcher.end() == matcher.start()) {
            i = 1;
        } else {
            i = 0;
        }
        int i2 = end + i;
        CharSequence charSequence = this.b;
        if (i2 > charSequence.length()) {
            return null;
        }
        Matcher matcher2 = matcher.pattern().matcher(charSequence);
        matcher2.getClass();
        if (!matcher2.find(i2)) {
            return null;
        }
        return new b(matcher2, charSequence);
    }
}
