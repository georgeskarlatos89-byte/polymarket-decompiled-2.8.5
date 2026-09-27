package io.sentry.util;

import io.intercom.android.sdk.carousel.CarouselScreenFragment;
import io.radar.sdk.util.RadarSimpleLogBuffer;
import io.sentry.m0;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public abstract class c {
    public static final List a = Arrays.asList("X-FORWARDED-FOR", "AUTHORIZATION", "COOKIE", "SET-COOKIE", "X-API-KEY", "X-REAL-IP", "REMOTE-ADDR", "FORWARDED", "PROXY-AUTHORIZATION", "X-CSRF-TOKEN", "X-CSRFTOKEN", "X-XSRF-TOKEN");
    public static final List b = Arrays.asList("JSESSIONID", "JSESSIONIDSSO", "JSSOSESSIONID", "SESSIONID", "SID", "CSRFTOKEN", "XSRF-TOKEN");
    public static final m0 c = new m0(CarouselScreenFragment.CAROUSEL_ANIMATION_MS, 499);
    public static final m0 d = new m0(RadarSimpleLogBuffer.MAX_PERSISTED_BUFFER_SIZE, 599);
}
