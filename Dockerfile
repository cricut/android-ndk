FROM alpine:3.10
COPY entrypoint.sh /
ENTRYPOINT ["/entrypoint.sh"]
