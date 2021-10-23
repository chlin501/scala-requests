package requests

sealed trait Status {
  def titles: Seq[String]
}
trait Informational extends Status
case object _100_ extends Informational {
  override def titles: Seq[String] = Seq("continue")
}
case object _101_ extends Informational {
  override def titles: Seq[String] = Seq("switching_protocols")
}
case object _102_ extends Informational {
  override def titles: Seq[String] = Seq("processing")
}
case object _103_ extends Informational {
  override def titles: Seq[String] = Seq("checkpoint")
}
case object _122_ extends Informational {
  override def titles: Seq[String] = Seq("uri_too_long", "request_uri_too_long")
}
case object _200_ extends Informational {
  override def titles: Seq[String] =
    Seq("ok", "okay", "all_ok", "all_okay", "all_good", "\\o/", "✓")
}
case object _201_ extends Informational {
  override def titles: Seq[String] = Seq("created")
}
case object _202_ extends Informational {
  override def titles: Seq[String] = Seq("accepted")
}
case object _203_ extends Informational {
  override def titles: Seq[String] =
    Seq("non_authoritative_info", "non_authoritative_information")
}
case object _204_ extends Informational {
  override def titles: Seq[String] = Seq("no_content")
}
case object _205_ extends Informational {
  override def titles: Seq[String] = Seq("reset_content", "reset")
}
case object _206_ extends Informational {
  override def titles: Seq[String] = Seq("partial_content", "partial")
}
case object _207_ extends Informational {
  override def titles: Seq[String] =
    Seq("multi_status", "multiple_status", "multi_stati", "multiple_stati")
}
case object _208_ extends Informational {
  override def titles: Seq[String] = Seq("already_reported")
}
case object _226_ extends Informational {
  override def titles: Seq[String] = Seq("im_used")
}
trait Redirection extends Status
case object _300_ extends Redirection {
  override def titles: Seq[String] = Seq("multiple_choices")
}
case object _301_ extends Redirection {
  override def titles: Seq[String] = Seq("moved_permanently", "moved", "\\\\o-")
}
case object _302_ extends Redirection {
  override def titles: Seq[String] = Seq("found")
}
case object _303_ extends Redirection {
  override def titles: Seq[String] = Seq("see_other", "other")
}
case object _304_ extends Redirection {
  override def titles: Seq[String] = Seq("not_modified")
}
case object _305_ extends Redirection {
  override def titles: Seq[String] = Seq("use_proxy")
}
case object _306_ extends Redirection {
  override def titles: Seq[String] = Seq("switch_proxy")
}
case object _307_ extends Redirection {
  override def titles: Seq[String] =
    Seq("temporary_redirect", "temporary_moved", "temporary")
}
case object _308_ extends Redirection {
  override def titles: Seq[String] =
    Seq("permanent_redirect", "resume_incomplete", "resume")
}
trait ClientError extends Status
case object _400_ extends ClientError {
  override def titles: Seq[String] = Seq("bad_request", "bad")
}
case object _401_ extends ClientError {
  override def titles: Seq[String] = Seq("unauthorized")
}
case object _402_ extends ClientError {
  override def titles: Seq[String] = Seq("payment_required", "payment")
}
case object _403_ extends ClientError {
  override def titles: Seq[String] = Seq("forbidden")
}
case object _404_ extends ClientError {
  override def titles: Seq[String] = Seq("not_found", "-o-")
}
case object _405_ extends ClientError {
  override def titles: Seq[String] = Seq("method_not_allowed", "not_allowed")
}
case object _406_ extends ClientError {
  override def titles: Seq[String] = Seq("not_acceptable")
}
case object _407_ extends ClientError {
  override def titles: Seq[String] =
    Seq("proxy_authentication_required", "proxy_auth", "proxy_authentication")
}
case object _408_ extends ClientError {
  override def titles: Seq[String] = Seq("request_timeout", "timeout")
}
case object _409_ extends ClientError {
  override def titles: Seq[String] = Seq("conflict")
}
case object _410_ extends ClientError {
  override def titles: Seq[String] = Seq("gone")
}
case object _411_ extends ClientError {
  override def titles: Seq[String] = Seq("length_required")
}
case object _412_ extends ClientError {
  override def titles: Seq[String] = Seq("precondition_failed", "precondition")
}
case object _413_ extends ClientError {
  override def titles: Seq[String] =
    Seq("request_entity_too_large")
}
case object _414_ extends ClientError {
  override def titles: Seq[String] = Seq("request_uri_too_large")
}
case object _415_ extends ClientError {
  override def titles: Seq[String] = Seq(
    "unsupported_media_type",
    "unsupported_media",
    "media_type"
  )
}
case object _416_ extends ClientError {
  override def titles: Seq[String] = Seq(
    "requested_range_not_satisfiable",
    "requested_range",
    "range_not_satisfiable"
  )
}
case object _417_ extends ClientError {
  override def titles: Seq[String] = Seq("expectation_failed")
}
case object _418_ extends ClientError {
  override def titles: Seq[String] = Seq(
    "im_a_teapot",
    "teapot",
    "i_am_a_teapot"
  )
}
case object _421_ extends ClientError {
  override def titles: Seq[String] = Seq("misdirected_request")
}
case object _422_ extends ClientError {
  override def titles: Seq[String] =
    Seq("unprocessable_entity", "unprocessable")
}
case object _423_ extends ClientError {
  override def titles: Seq[String] = Seq("locked")
}
case object _424_ extends ClientError {
  override def titles: Seq[String] = Seq("failed_dependency", "dependency")
}
case object _425_ extends ClientError {
  override def titles: Seq[String] = Seq("unordered_collection", "unordered")
}
case object _426_ extends ClientError {
  override def titles: Seq[String] = Seq("upgrade_required", "upgrade")
}
case object _428_ extends ClientError {
  override def titles: Seq[String] =
    Seq("precondition_required', 'precondition")
}
case object _429_ extends ClientError {
  override def titles: Seq[String] = Seq("too_many_requests", "too_many")
}
case object _431_ extends ClientError {
  override def titles: Seq[String] = Seq(
    "header_fields_too_large",
    "fields_too_large"
  )
}
case object _444_ extends ClientError {
  override def titles: Seq[String] = Seq("no_response", "none")
}
case object _449_ extends ClientError {
  override def titles: Seq[String] = Seq("retry_with", "retry")
}
case object _450_ extends ClientError {
  override def titles: Seq[String] =
    Seq("blocked_by_windows_parental_controls", "parental_controls")
}
case object _451_ extends ClientError {
  override def titles: Seq[String] =
    Seq("unavailable_for_legal_reasons", "legal_reasons")
}
case object _499_ extends ClientError {
  override def titles: Seq[String] = Seq("client_closed_request")
}
trait ServerError extends Status
case object _500_ extends ServerError {
  override def titles: Seq[String] = Seq(
    "internal_server_error",
    "server_error",
    "/o\\\\",
    "✗"
  )
}
case object _501_ extends ServerError {
  override def titles: Seq[String] = Seq("not_implemented")
}
case object _502_ extends ServerError {
  override def titles: Seq[String] = Seq("bad_gateway")
}
case object _503_ extends ServerError {
  override def titles: Seq[String] = Seq("service_unavailable", "unavailable")
}
case object _504_ extends ServerError {
  override def titles: Seq[String] = Seq("gateway_timeout")
}
case object _505_ extends ServerError {
  override def titles: Seq[String] = Seq(
    "http_version_not_supported",
    "http_version"
  )
}
case object _506_ extends ServerError {
  override def titles: Seq[String] = Seq("variant_also_negotiates")
}
case object _507_ extends ServerError {
  override def titles: Seq[String] = Seq("insufficient_storage")
}
case object _509_ extends ServerError {
  override def titles: Seq[String] = Seq(
    "bandwidth_limit_exceeded",
    "bandwidth"
  )
}
case object _510_ extends ServerError {
  override def titles: Seq[String] = Seq("not_extended")
}
case object _511_ extends ServerError {
  override def titles: Seq[String] = Seq(
    "network_authentication_required",
    "network_auth",
    "network_authentication"
  )
}
