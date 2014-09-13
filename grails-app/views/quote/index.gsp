<div class="quotes">
  <ul>
    <g:each in="${quotes }" var="q">
      <li> <g:link controller="quote" action="edit" id="${q.id }">  ${q.text} </g:link>  </li>
    </g:each>
  </ul>

</div>