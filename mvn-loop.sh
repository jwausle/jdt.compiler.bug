SUCCESS=0
FAILED=0

trap "{ echo Finished failed/success=${FAILED}/${SUCCESS}. ; exit 0; }" SIGINT SIGTERs

while true
do
  rm -rf .m2/
  if mvn install -Dmaven.repo.local=.m2/repository ; then
    SUCCESS=$((SUCCESS+1))
  else
    FAILED=$((FAILED+1))
  fi
  echo "failed/success=${FAILED}/${SUCCESS} ..."
  sleep 3
done
